import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bela {
    private Map<Character, Integer> dominant = new HashMap<>();
    private Map<Character, Integer> notDominant = new HashMap<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;
        int sum = 0;

        try {

            line = br.readLine().split(" ");

            int nbrOfHands = Integer.parseInt(line[0]);
            char dominantType = line[1].charAt(0);

            for (int i = 0; i < 4*nbrOfHands; i++) {
                char[] hand = br.readLine().toCharArray();

                if (hand[1] == dominantType) {
                    sum += dominant.get(hand[0]);
                } else {
                    sum += notDominant.get(hand[0]);
                }
            }

            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void setUpTable() {
        dominant.put('A', 11);
        notDominant.put('A', 11);
        dominant.put('K', 4);
        notDominant.put('K', 4);
        dominant.put('Q', 3);
        notDominant.put('Q', 3);
        dominant.put('J', 20);
        notDominant.put('J', 2);
        dominant.put('T', 10);
        notDominant.put('T', 10);
        dominant.put('9', 14);
        notDominant.put('9', 0);
        dominant.put('8', 0);
        notDominant.put('8', 0);
        dominant.put('7', 0);
        notDominant.put('7', 0);
    }



    public static void main(String[] args) {
        Bela bela = new Bela();
        bela.setUpTable();
        bela.parse();
    }

}
