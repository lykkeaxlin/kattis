import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Faktor {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;

        try {

            line = br.readLine().split(" ");
            int articles = Integer.parseInt(line[0]);
            int impactFactor = Integer.parseInt(line[1]);

            if (articles == 1) {
                System.out.println(impactFactor);
            } else {
                System.out.println((int) Math.ceil((impactFactor - 0.9999999) * articles));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Faktor faktor = new Faktor();
        faktor.parse();
    }


}
