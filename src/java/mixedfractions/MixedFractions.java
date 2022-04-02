import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MixedFractions {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;

        try {

            while (!(line = br.readLine()).equals("0 0")) {

                String[] nbs = line.split(" ");

                int i1 = Integer.parseInt(nbs[0]);
                int i2 = Integer.parseInt(nbs[1]);

                checkFraction(i1, i2);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkFraction(int i1, int i2) {

        int whole = i1 / i2;
        int frac = i1 - (whole * i2);

        System.out.println(whole + " " + frac + " / " + i2);
    }

    public static void main(String[] args) {
        MixedFractions mixedFractions = new MixedFractions();
        mixedFractions.parse();
    }
}
