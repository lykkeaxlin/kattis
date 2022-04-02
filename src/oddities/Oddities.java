import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oddities {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {

            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                int nbr = Integer.parseInt(br.readLine());

                if (nbr % 2 == 0) {
                    System.out.println(nbr + " is even");
                } else {
                    System.out.println(nbr + " is odd");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Oddities oddities = new Oddities();
        oddities.parse();
    }
}
