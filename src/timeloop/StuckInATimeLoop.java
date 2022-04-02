import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StuckInATimeLoop {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {

            int count = Integer.parseInt(br.readLine());

            for (int i = 1; i <= count; i++) {
                System.out.println(i + " Abracadabra");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StuckInATimeLoop stuckInATimeLoop = new StuckInATimeLoop();
        stuckInATimeLoop.parse();
    }

}
