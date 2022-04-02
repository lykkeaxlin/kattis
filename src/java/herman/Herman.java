import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Herman {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int radius = Integer.parseInt(br.readLine());
            System.out.println(euclideanArea(radius));
            System.out.println(hermanArea(radius));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double euclideanArea(int radius) {
        return Math.PI*(Math.pow(radius,2));
    }

    private double hermanArea(int radius) {
        return 2*(Math.pow(radius,2));
    }

    public static void main(String[] args) {
        Herman herman = new Herman();
        herman.parse();
    }
}
