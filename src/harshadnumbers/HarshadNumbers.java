import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarshadNumbers {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int nbr = Integer.parseInt(br.readLine());

            if (isItHarshadNbr(nbr)) {
                System.out.println(nbr);
            } else {

                while (!isItHarshadNbr(nbr)) {
                    nbr++;
                }
                System.out.println(nbr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int sumOfDigits(int nbr) {

        int sum = 0;

        while (nbr > 0) {
            sum += nbr % 10;
            nbr /= 10;
        }
        return sum;
    }

    public boolean isItHarshadNbr(int nbr) {

        int sum = sumOfDigits(nbr);

        if (nbr % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        HarshadNumbers harshadNumbers = new HarshadNumbers();
        harshadNumbers.parse();
    }
}
