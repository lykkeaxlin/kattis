import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tarifa {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int usedMB = 0;

            int nbrOfMB = Integer.parseInt(br.readLine());
            int nbrOfMonths = Integer.parseInt(br.readLine());

            for (int i = 0; i < nbrOfMonths; i++) {
                usedMB += Integer.parseInt(br.readLine());
            }

            System.out.println(nbrOfMB * (nbrOfMonths + 1) - usedMB);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tarifa tarifa = new Tarifa();
        tarifa.parse();
    }

}
