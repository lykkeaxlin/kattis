import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soylent {
    private int caloriesPerBottle = 400;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                int testCase = Integer.parseInt(br.readLine());

                System.out.println(calculateNumberOfBottles(testCase));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int calculateNumberOfBottles(int calorieIntake) {
        int nbrOfBottles = (int) Math.ceil((double) calorieIntake / caloriesPerBottle);
        return nbrOfBottles;
    }

    public static void main(String[] args) {
        Soylent soylent = new Soylent();
        soylent.parse();
    }
}
