import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceCup {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] input = br.readLine().split(" ");

            int dice1 = Integer.parseInt(input[0]);
            int dice2 = Integer.parseInt(input[1]);

            printResult(Math.min(dice1, dice2) + 1, Math.max(dice1, dice2) + 1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printResult(int dice1, int dice2) {

        for (int i = dice1; i <= dice2; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        DiceCup diceCup = new DiceCup();
        diceCup.parse();
    }
}
