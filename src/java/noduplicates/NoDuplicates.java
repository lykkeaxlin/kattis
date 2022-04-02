import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NoDuplicates {
    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> words = new HashSet<>();

        try {

            String[] line = br.readLine().split(" ");
            Collections.addAll(words, line);

            if (words.size() == line.length) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NoDuplicates noDuplicates = new NoDuplicates();
        noDuplicates.parse();
    }
}
