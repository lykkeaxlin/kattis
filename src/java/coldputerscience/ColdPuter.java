import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColdPuter {

    public int parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;
        int counter = 0;

        try {

            br.readLine();

            line = br.readLine().split(" ");


            for (String s : line) {
                if (Integer.parseInt(s) < 0) {
                    counter++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

    public static void main(String[] args) {
        ColdPuter cp = new ColdPuter();
        System.out.println(cp.parse());
    }
}
