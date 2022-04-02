import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimonSays {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                String[] line = br.readLine().split(" ");

                print(line);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(String[] line) {

        if (line[0].equals("Simon") && line[1].equals("says")) {

            for (int i = 2; i < line.length; i++) {

                if (i == 2) {
                    System.out.print(line[i] + " ");
                } else if (i + 1 == line.length) {
                    System.out.println(line[i]);
                } else {
                    System.out.print(line[i] + " ");
                }

            }
        }
    }

    public static void main(String[] args) {
        SimonSays simonSays = new SimonSays();
        simonSays.parse();
    }
}
