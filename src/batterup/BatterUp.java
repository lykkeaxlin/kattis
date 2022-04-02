import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BatterUp {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int positveNbrs = 0;

        try {

            br.readLine();

            String[] nbrs = br.readLine().split(" ");

            for (String s : nbrs) {
                int i = Integer.parseInt(s);

                if (i >= 0) {
                    sum += Integer.parseInt(s);
                    positveNbrs++;
                }
            }

            System.out.println(sum / positveNbrs);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        BatterUp batterUp = new BatterUp();
        batterUp.parse();
    }
}

