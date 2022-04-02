import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Rijeci {
    int countA = 1;
    int countB = 0;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

                for (int i = 0; i < n; i++) {
                    int prevB = countB;

                    countB = countA + countB;
                    countA = prevB;
                }

                System.out.println(countA + " " + countB);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Rijeci rijeci = new Rijeci();
        rijeci.parse();
    }
}
