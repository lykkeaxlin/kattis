import java.util.Scanner;

public class AboveAverage {

    public void parse() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int nbrOfStudents = sc.nextInt();
            int[] arr = new int[nbrOfStudents];
            double average = 0;

            for (int j = 0; j < nbrOfStudents; j++) {
                arr[j] = sc.nextInt();
                average += arr[j];
            }

            average = average / nbrOfStudents;
            int pplAboveAverage = 0;

            for (int j = 0; j < nbrOfStudents; j++) {
                if (arr[j] > average) {
                    pplAboveAverage++;
                }
            }

            System.out.printf("%.3f%s  \n", (double) pplAboveAverage / nbrOfStudents * 100, "%");
        }
    }

    public static void main(String[] args) {
        AboveAverage aboveAverage = new AboveAverage();
        aboveAverage.parse();
    }
}

