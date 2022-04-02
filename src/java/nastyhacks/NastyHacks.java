package nastyhacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NastyHacks {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                String[] nbrs = br.readLine().split(" ");

                int revenue = Integer.parseInt(nbrs[0]);
                int withoutAd = Integer.parseInt(nbrs[1]);
                int adCost = Integer.parseInt(nbrs[2]);

                if (revenue > withoutAd - adCost) {
                    System.out.println("do not advertise");
                } else if (revenue == (withoutAd - adCost)) {
                    System.out.println("does not matter");
                } else {
                    System.out.println("advertise");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NastyHacks nastyHacks = new NastyHacks();
        nastyHacks.parse();
    }
}
