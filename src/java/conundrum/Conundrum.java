import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conundrum {
    static int days = 0;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String s = br.readLine();

            checkLine(s);
            System.out.println(days);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkLine(String word) {
        int i = 0;

        int iterations = word.length()/3;

        for (int j = 0; j < iterations; j++) {
            String substring = word.substring(i, i+3);

            days += nbrOfDifferences(substring);

            i += 3;
            }
        }


    private int nbrOfDifferences(String s) {
        String per = "PER";
        int differences = 0;

        for (int i = 0; i  < s.length(); i++) {
            if (!(per.charAt(i) == s.charAt(i))) {
                differences++;
            }
        }
        return differences;
    }

    public static void main(String[] args) {
        Conundrum conundrum = new Conundrum();
        conundrum.parse();
    }
}
