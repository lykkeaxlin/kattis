import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Easiest {


    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int i;

            while ((i = Integer.parseInt(br.readLine())) != 0) {
                System.out.println(findN(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int findN(int n) {
        int sumN = sumOfDigits(n);

        int p = 11;

        while (sumOfDigits(n * p) != sumN) {
            p++;
        }
        return p;
    }

    private int sumOfDigits(int i) {
        int sum = 0;

        while (i > 0) {
            sum = sum + i % 10;
            i /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Easiest easiest = new Easiest();
        easiest.parse();
    }
}
