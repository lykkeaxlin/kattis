import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ladder {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] line = br.readLine().split(" ");

            int height = Integer.parseInt(line[0]);
            double angle = Math.toRadians(Integer.parseInt(line[1]));

            double length = height / Math.sin(angle);

            System.out.println((int) Math.ceil(length));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Ladder ladder = new Ladder();
        ladder.parse();
    }
}
