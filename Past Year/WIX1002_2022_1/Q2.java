package WIX1002_2022_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Q2 {
    private static final String[] LABELS = {"Gold", "Silver", "Bronze"};
    private static final String FILE = "src/WIX1002_2022_1/diving.txt";
    private static final int ATTEMPTS = 3;
    private static final int JUDGES = 7;

    public static void main(String[] args) {
        List<Diving> divingList = readDivingDataFromFile();

        displayDivingList(divingList);
        displayTopDivers(divingList, 3);
    }

    private static List<Diving> readDivingDataFromFile() {
        try (Scanner scanner = new Scanner(new FileInputStream(FILE))) {
            return parseDivingData(scanner);
        } catch (IOException ex) {
            System.err.println("Error reading file: " + ex.getMessage());
            return Collections.emptyList();
        }
    }

    private static List<Diving> parseDivingData(Scanner scanner) {
        List<Diving> divingList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            String country = scanner.nextLine();
            double[][] scores = new double[ATTEMPTS][JUDGES];
            double[] difficulty = new double[ATTEMPTS];

            for (int attempt = 0; attempt < ATTEMPTS; attempt++) {
                String[] line = scanner.nextLine().split(" ");
                for (int judge = 0; judge < JUDGES; judge++) {
                    scores[attempt][judge] = Double.parseDouble(line[judge]);
                }
                difficulty[attempt] = Double.parseDouble(line[7]);
            }

            divingList.add(new Diving(name, country, scores, difficulty));
        }

        return divingList;
    }

    private static void displayDivingList(List<Diving> divingList) {
        divingList.forEach(System.out::println);
    }

    private static void displayTopDivers(List<Diving> divingList, int topCount) {
        List<Diving> sortedDivingList = new ArrayList<>(divingList);
        sortedDivingList.sort(Comparator.comparingDouble(Diving::getFinalScore).reversed());

        sortedDivingList.stream()
            .limit(topCount)
            .forEachOrdered(diver -> {
                String label = LABELS[sortedDivingList.indexOf(diver)];
                System.out.printf("%s : %s (%s)%n", label, diver.name(), diver.country());
            });
    }
}

// Nested record or second class (can be top-level if moved to another file)
record Diving(String name, String country, double[][] scores, double[] difficulty) {
    private static final String NAME_COUNTRY_FORMAT = "Diver : %s (%s)%n";
    private static final String SCORES_RATING_FORMAT = "Judges Scores : %s\nDifficulty Rating : %.1f%n";
    private static final String FINAL_SCORE_FORMAT = "Final score : %.1f%n";

    public double getFinalScore() {
        return Arrays.stream(scores)
            .mapToDouble(this::calculateScoreForAttempt)
            .sum();
    }

    private double calculateScoreForAttempt(double[] attemptScores) {
        double[] sortedScores = Arrays.copyOf(attemptScores, attemptScores.length);
        Arrays.sort(sortedScores);
        double sumOfMiddleScores = Arrays.stream(sortedScores, 2, sortedScores.length - 2).sum();
        int index = findAttemptIndex(attemptScores);
        return sumOfMiddleScores * difficulty[index];
    }

    private int findAttemptIndex(double[] attemptScores) {
        for (int i = 0; i < scores.length; i++) {
            if (Arrays.equals(scores[i], attemptScores)) {
                return i;
            }
        }
        return -1; // Should not happen if inputs are valid
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(NAME_COUNTRY_FORMAT, name, country));
        for (int i = 0; i < scores.length; i++) {
            String scoresString = Arrays.stream(scores[i])
                .mapToObj(score -> String.format("%.1f", score))
                .collect(Collectors.joining(" "));
            sb.append(String.format(SCORES_RATING_FORMAT, scoresString, difficulty[i]));
        }
        sb.append(String.format(FINAL_SCORE_FORMAT, getFinalScore()));
        return sb.toString();
    }
}
