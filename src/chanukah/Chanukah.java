package chanukah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chanukah {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int itr = Integer.parseInt(br.readLine());

            for (int i = 0; i < itr; i++) {
                String[] line = br.readLine().split(" ");
                int days = Integer.parseInt(line[1]);

                System.out.println(i+1 + " " + calculate(days + 1));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private int calculate(int beta) {
        int alpha = 2;
        return ((beta - alpha + 1) * (alpha + beta))/2;
    }


    public static void main(String[] args) {
        Chanukah chanukah = new Chanukah();
        chanukah.parse();
    }
}
