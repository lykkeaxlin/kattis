import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Everywhere {


    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int nbr = Integer.parseInt(br.readLine());

            Set<String> cities = new HashSet<>();

            int nbr2 = Integer.parseInt(br.readLine());

            for (int i = 0; i < nbr; i++) {

                for (int j = 0; j < nbr2; j++) {
                    cities.add(br.readLine());
                }

                System.out.println(cities.size());

                String line;

                if ((line = br.readLine()) != null) {
                    cities = new HashSet<>();
                    nbr2 = Integer.parseInt(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Everywhere everywhere = new Everywhere();
        everywhere.parse();
    }
}
