import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickEstimates {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                char[] nbr = br.readLine().toCharArray();

                if (nbr[0] != 0) {
                    System.out.println(nbr.length);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        QuickEstimates quickEstimates = new QuickEstimates();
        quickEstimates.parse();
    }
}
