import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BabelFish {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> dictonary = new HashMap<>();
        Set<String> words = new HashSet<>();
        String line;

        try {

            while (!(line = br.readLine()).isEmpty()) {

                String[] word = line.split(" ");
                dictonary.put(word[1], word[0]);
                words.add(word[1]);
            }

            while ((line = br.readLine()) != null) {

                if (words.contains(line)) {
                    System.out.println(dictonary.get(line));
                } else {
                    System.out.println("eh");
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BabelFish babelFish = new BabelFish();
        babelFish.parse();
    }
}
