import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pot {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;

        try {

            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                int nbr = Integer.parseInt(br.readLine());
                int pow = nbr % 10;

                x += Math.pow((nbr / 10), pow);

            }
            System.out.println(x);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Pot pot = new Pot();
        pot.parse();
    }
}
