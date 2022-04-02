import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apaxiaaans {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            char[] word = br.readLine().toCharArray();

            StringBuilder sb = new StringBuilder();

            sb.append(word[0]);

            for (int i = 1; i < word.length; i++) {
                if (word[i] != word[i -1]) {
                    sb.append(word[i]);
                }
            }

            System.out.println(sb.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Apaxiaaans apaxiaaans = new Apaxiaaans();
        apaxiaaans.parse();
    }


}
