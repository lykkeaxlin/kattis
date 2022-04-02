import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolvingForCarrots {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {

            System.out.println(Integer.parseInt(br.readLine().split(" ")[1]));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SolvingForCarrots solvingForCarrots = new SolvingForCarrots();
        solvingForCarrots.parse();
    }
}
