import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

public class HumanCannonBall {

    double v0, theta, x1, h1, h2;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                String[] input = br.readLine().split(" ");

                v0 = Double.parseDouble(input[0]);
                theta = Double.parseDouble(input[1]);
                x1 = Double.parseDouble(input[2]);
                h1 = Double.parseDouble(input[3]);
                h2 = Double.parseDouble(input[4]);

                if (isItSafe()) {
                    System.out.println("Safe");
                } else {
                    System.out.println("Not Safe");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isItSafe() {

        double t = x1 / (v0 * Math.cos((theta * PI) / 180));
        double y = v0 * t * Math.sin((theta * PI) / 180) - (0.5 * (9.8 * Math.pow(t, 2)));

        return (y - h1 >= 1) && (h2 - y >= 1);
    }

    public static void main(String[] args) {
        HumanCannonBall humanCannonBall = new HumanCannonBall();
        humanCannonBall.parse();
    }
}
