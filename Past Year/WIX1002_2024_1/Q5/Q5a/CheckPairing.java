package WIX1002_2024_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class CheckPairing {
    private static final String file = "src/WIX1002_2024_1/Q5/Q5a/participants.txt";

    public static void main(String[] args) {

        String info = readFile(file);
        String[][] participantInfoMatrix = ParticipantInfoParser.parseParticipantInfo(info);
        Optional<Pair[]> pairs = PairFinder.findMatchingPairs(participantInfoMatrix);

        pairs.ifPresentOrElse(
                p -> System.out.println("Matching pairs found:\n" + SeatingUtil.arrangeSeating(p)),
                () -> System.out.println("No matching pairs found."));
    }

    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileInputStream(filePath))) {
            while (scanner.hasNextLine())
                content.append(scanner.nextLine()).append(System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }
}
