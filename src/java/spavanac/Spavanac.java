import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Spavanac {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] input = br.readLine().split(" ");
            int hour = Integer.parseInt(input[0]);
            int minute = Integer.parseInt(input[1]);

            if (hour == 0) {
                System.out.println(23 + " " + (60 + minute - 45));
            } else if (minute < 45) {
                System.out.println(hour-1 + " " + (60 + minute - 45));
            } else {
                System.out.println(hour + " " + (minute - 45));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Spavanac spavanac = new Spavanac();
        spavanac.parse();
    }
}
