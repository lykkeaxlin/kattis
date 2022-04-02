import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CD {
    Set<String> jack;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int n, m, counter = 0;

        try {

            input = br.readLine().split(" ");

            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);

            while (n != 0 && m != 0) {

                jack = new HashSet<>();
                counter = 0;

                for (int i = 0; i < n; i++) {
                    jack.add((br.readLine()));
                }

                for (int i = 0; i < m; i++) {
                    String cd = br.readLine();

                    if (jack.contains(cd)) {
                        counter++;
                    }
                }

                System.out.println(counter);

                input = br.readLine().split(" ");

                n = Integer.parseInt(input[0]);
                m = Integer.parseInt(input[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CD cd = new CD();
        cd.parse();
    }
}
