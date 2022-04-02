import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class QuickBrownFox {
    Set<Character> alphabet = new HashSet<>();


    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                reloadSet();

                char[] line = br.readLine().toLowerCase().toCharArray();
                checkLine(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reloadSet() {
        alphabet = new HashSet<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g',
        'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z'
        ));
    }

    public void checkLine(char[] input) {
        for (char c : input) {
            alphabet.remove(c);
        }

        if (alphabet.isEmpty()) {
            System.out.println("pangram");
        } else {
            System.out.println("missing " + formatSet());
        }
    }

    public String formatSet() {

        String format = alphabet.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .trim();

        return format;
    }


   public static void main(String[] args) {
        QuickBrownFox quickBrownFox = new QuickBrownFox();
        quickBrownFox.parse();
        quickBrownFox.reloadSet();
   }
}
