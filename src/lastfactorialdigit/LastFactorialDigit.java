import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastFactorialDigit {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                int nbr = Integer.parseInt(br.readLine());

                int fac = factorial(nbr);
                System.out.println(fac % 10);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int factorial(int n) {
        int[] array = new int [10];

        if (n <= 1) {
            return 1;
        } else if (array[n-1] == 0) {
            array[n-1] = n*factorial(n -1) ;
        }
        return array[n-1];
    }

    public static void main(String[] args) {
        LastFactorialDigit lastFactorialDigit = new LastFactorialDigit();
        lastFactorialDigit.parse();


    }
}
