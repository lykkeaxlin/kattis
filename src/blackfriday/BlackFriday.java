import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BlackFriday {
    int[] nbrs;
    Map<Integer, Integer> index = new HashMap<>();
    Set<Integer> duplicates = new HashSet<>();

    String[] numbers;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

           int n = Integer.parseInt(br.readLine());
           nbrs = new int[n];

            numbers = br.readLine().split(" ");

            fillNbrs(n);

            checkArray();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fillNbrs(int n) {
        for (int i = 0; i < n; i++) {
            int nbr = Integer.parseInt(numbers[i]);
            nbrs[i] = nbr;
            index.put(nbr, i +1);
        }

        Arrays.sort(nbrs);

    }

    public void checkArray() {

        for (int i = nbrs.length - 1; i > -1; i--) {
            if (i > 0) {
                if (nbrs[i] == nbrs[i - 1]) {
                    duplicates.add(nbrs[i]);
                }
            }

            if (!duplicates.contains(nbrs[i])) {
                System.out.println(index.get(nbrs[i]));
                break;
            }

            if (i == 1 && nbrs[1] == nbrs[0]) {
                System.out.println("none");
            }
        }
    }

    public static void main(String[] args) {
        BlackFriday blackFriday = new BlackFriday();
        blackFriday.parse();

    }
}
