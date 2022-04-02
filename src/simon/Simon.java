import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simon {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String line = br.readLine();

                if (line.startsWith("simon says")) {
                    System.out.println(line.substring(11));

            } else {
                System.out.print("\n");
            }
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Simon simon = new Simon();
        simon.parse();
    }
}
