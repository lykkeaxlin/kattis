import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Planina {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {

            int nbr = Integer.parseInt(br.readLine());

            double i = Math.pow(2, nbr) + 1;

            System.out.println((int) Math.pow(i, 2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Planina planina = new Planina();
        planina.parse();
    }


}
