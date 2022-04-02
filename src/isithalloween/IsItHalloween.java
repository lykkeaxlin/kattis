import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsItHalloween {


    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] input = br.readLine().split(" ");

            String month = input[0];
            int date = Integer.parseInt(input[1]);

            if ((month.equals("OCT") && date == 31) || (month.equals("DEC") && date == 25)) {
                    System.out.println("yup");
                } else {
                System.out.println("nope");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IsItHalloween isItHalloween = new IsItHalloween();
        isItHalloween.parse();
    }
}
