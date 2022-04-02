import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sibice {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] line = br.readLine().split(" ");

            int nbrOfMatches = Integer.parseInt(line[0]);
            int width = Integer.parseInt(line[1]);
            int breadth = Integer.parseInt(line[2]);

            double hyp = Math.hypot(width, breadth);

            for (int i = 0; i < nbrOfMatches; i++) {
                double length = Integer.parseInt(br.readLine().split(" ")[0]);

                if (length <= hyp) {
                    System.out.println("DA");
                } else {
                    System.out.println("NE");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Sibice sibice = new Sibice();
        sibice.parse();
    }
}
