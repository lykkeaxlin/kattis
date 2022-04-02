import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketballOneOnOne {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int a = 0;
            int b = 0;
            int i = 0;

            String s = br.readLine();

            while (i < s.length() - 1) {

                if (s.charAt(i) == 'A') {
                    a += Character.getNumericValue(s.charAt(i+1));
                } else {
                    b += Character.getNumericValue(s.charAt(i+1));
                }
                i += 2;
            }

            char winner = Math.max(a,b) == a ? 'A' : 'B';
            System.out.println(winner);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BasketballOneOnOne basketballOneOnOne = new BasketballOneOnOne();
        basketballOneOnOne.parse();
    }
}
