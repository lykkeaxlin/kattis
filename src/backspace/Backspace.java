import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backspace {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String line = br.readLine();
            decodeLine(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void decodeLine(String line) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {

            if (line.charAt(i) == '<') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(line.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Backspace backspace = new Backspace();
        backspace.parse();
    }
}
