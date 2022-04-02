import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Autori {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;

        try {

            line = br.readLine().split("-");
            char[] word = new char[line.length];

            for (int i = 0; i < line.length; i++) {
                word[i] = line[i].charAt(0);
            }

            System.out.println(word);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Autori autori = new Autori();
        autori.parse();
    }

}
