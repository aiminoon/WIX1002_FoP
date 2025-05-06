package WIX1002_2018_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Essay essay = new Essay(
                    getIntInput(sc, compose("Grammar", 30), 0, 30),
                    getIntInput(sc, compose("Spelling", 20), 0, 20),
                    getIntInput(sc, compose("Length", 20), 0, 20),
                    getIntInput(sc, compose("Content", 30), 0, 30));
            System.out.println("\n" + essay);
        }
    }

    private static String compose(String label, int max) {
        return String.format("Enter the marks for %s (maximum %d) marks: ", label, max);
    }

    private static int getIntInput(Scanner sc, String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);
            input = sc.nextInt();
        } while (input < min || input > max);
        return input;
    }
}

class GradedActivity {
    protected int score;

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public char getGrade() {
        if (score >= 90)
            return 'A';
        else if (score >= 80)
            return 'B';
        else if (score >= 70)
            return 'C';
        else if (score >= 60)
            return 'D';
        else
            return 'F';
    }

    @Override
    public String toString() {
        return String.format("Score: %d, Grade: %c", score, getGrade());
    }
}

class Essay extends GradedActivity {
    private final int grammar;
    private final int spelling;
    private final int length;
    private final int content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        setScore(grammar + spelling + length + content);
    }

    public int getGrammar() {
        return grammar;
    }

    public int getSpelling() {
        return spelling;
    }

    public int getLength() {
        return length;
    }

    public int getContent() {
        return content;
    }

    @Override
    public String toString() {
        return String.format("""
            Essay score:
            Grammar: %d
            Spelling: %d
            Length: %d
            Content: %d
            Total Score: %d
            Essay grade: %c
        """, grammar, spelling, length, content, score, getGrade());
    }
}
