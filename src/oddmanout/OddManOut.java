import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class OddManOut {
    Set<Integer> guestNbrs;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                int nbrOfGuests = Integer.parseInt(br.readLine());
                String[] guests = br.readLine().split( " ");
                guestNbrs = new HashSet<>();

                for (int j = 0; j < nbrOfGuests; j++) {

                    int nbr = Integer.parseInt(guests[j]);

                    if (guestNbrs.contains((nbr))) {
                        guestNbrs.remove(nbr);
                    } else {
                        guestNbrs.add(nbr);
                    }

                }
                System.out.println("Case #" + (i+1) + ": " + guestNbrs.toString().replace("[", "").replace("]", ""));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OddManOut oddManOut = new OddManOut();
        oddManOut.parse();
    }
}
