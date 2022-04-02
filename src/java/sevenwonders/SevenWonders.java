import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SevenWonders {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nbrOfT = 0;
        int nbrOfC = 0;
        int nbrOfG = 0;

        try {

            char[] line = br.readLine().toCharArray();

            for (char c : line) {
                if (c == 'T') {
                    nbrOfT++;
                } else if (c == 'C') {
                    nbrOfC++;
                } else {
                    nbrOfG++;
                }
            }

            int bonus = Math.min(Math.min(nbrOfC, nbrOfT), nbrOfG);

            System.out.println((int) (Math.pow(nbrOfC, 2) + Math.pow(nbrOfG, 2) + Math.pow(nbrOfT, 2) + bonus*7));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SevenWonders sevenWonders = new SevenWonders();
        sevenWonders.parse();
    }
}
