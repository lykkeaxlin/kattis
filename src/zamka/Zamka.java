import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zamka {
    private int lowest;
    private int highest;
    private int sum;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            lowest = Integer.parseInt(br.readLine());
            highest = Integer.parseInt(br.readLine());
            sum = Integer.parseInt(br.readLine());

            System.out.println(findMinimal());
            System.out.println(findMaximal());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private int findMinimal() {
        int temp = lowest;

        while (temp <= highest && sumOfDigits(temp) < sum) {
            temp++;
        }
        return temp;
    }

    private int findMaximal() {
        int temp = highest;

        while (sumOfDigits(temp) != sum) {
            temp--;
        }
        return temp;
    }
    
    public static void main(String[] args) {
        Zamka zamka = new Zamka();
        zamka.parse();
    }
}
