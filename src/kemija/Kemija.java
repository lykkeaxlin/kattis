import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Kemija {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {

            String[] line = br.readLine().split(" ");

            for (int i = 0; i < line.length; i++) {
                sb.append(decoder(line[i]));

                if (i + 1 != line.length) {
                    sb.append(" ");
                }
            }

            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String decoder(String word) {
        word = word.replaceAll("epe", "e");
        word = word.replaceAll("apa", "a");
        word = word.replaceAll("ipi", "i");
        word = word.replaceAll("opo", "o");
        word = word.replaceAll("upu", "u");

        return word;
    }

    public static void main(String[] args) {
        Kemija kemija = new Kemija();
        kemija.parse();
    }
}
