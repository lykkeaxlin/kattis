import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeTwoStones {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

           int input = Integer.parseInt(br.readLine());

           if (input % 2 == 0) {
               System.out.println("Bob");
           } else {
               System.out.println("Alice");
           }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TakeTwoStones takeTwoStones = new TakeTwoStones();
        takeTwoStones.parse();
    }

}
