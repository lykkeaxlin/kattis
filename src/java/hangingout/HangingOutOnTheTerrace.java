import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HangingOutOnTheTerrace {
    int counter = 0;
    int people = 0;
    int limit;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] input = br.readLine().split(" ");

            limit = Integer.parseInt(input[0]);
            int event = Integer.parseInt(input[1]);

            for (int i = 0; i < event; i++) {
                String[] line = br.readLine().split(" ");
                calcPeople(line[0], Integer.parseInt(line[1]));
            }

            System.out.println(counter);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void calcPeople(String action, int ppl) {

        if (action.equals("enter")) {
            if (ppl + people <= limit) {
                people += ppl;
            } else {
                counter++;
            }
        } else if (action.equals("leave")) {
            people -= ppl;
        }
    }

    public static void main(String[] args) {
        HangingOutOnTheTerrace hangingOutOnTheTerrace = new HangingOutOnTheTerrace();
        hangingOutOnTheTerrace.parse();
    }
}
