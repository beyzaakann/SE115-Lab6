import java.util.Random;

public class Lab6bonus {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] scores = new int[5][4];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = r.nextInt(101);
            }
        }

        System.out.println("Scores table:");
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Student averages:");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double average = (double) sum / scores[i].length;
            System.out.printf("Student %d average: %.2f\n", i, average);
        }

        System.out.println("Quiz averages:");
        for (int j = 0; j < scores[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            double average = (double) sum / scores.length;
            System.out.printf("Quiz %d average: %.2f\n", j, average);
        }

        int max = scores[0][0];
        int maxStudent = 0;
        int maxQuiz = 0;

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] > max) {
                    max = scores[i][j];
                    maxStudent = i;
                    maxQuiz = j;
                }
            }
        }

        System.out.println("Highest score: " + max + " at (" + maxStudent + ", " + maxQuiz + ")");
    }
}
