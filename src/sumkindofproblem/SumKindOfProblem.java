import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumKindOfProblem {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int cases = Integer.parseInt(br.readLine());

            for (int i = 0; i < cases; i++) {
                String[] line = br.readLine().split(" ");

                int k = Integer.parseInt(line[0]);
                int n = Integer.parseInt(line[1]);

                findNbrs(k,n);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findNbrs(int k, int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int sumPositive = 0;

        for (int i = 1; i < (n * 2) + 1; i++) {

            if (i < n +1) {
                sumPositive += i;
            }

            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println(k + " " + sumPositive + " " +sumOdd + " " + sumEven);
    }


    public static void main(String[] args) {
        SumKindOfProblem sumKindOfProblem = new SumKindOfProblem();
        sumKindOfProblem.parse();
    }
}
