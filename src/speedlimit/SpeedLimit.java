import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SpeedLimit {

    List<Integer> speed = new ArrayList<>();
    List<Integer> hour = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int counter = 0;
            int n = Integer.parseInt(br.readLine());

            while (counter < n) {
                String[] input = br.readLine().split(" ");

                speed.add(Integer.parseInt(input[0]));
                hour.add(Integer.parseInt(input[1]));

                counter++;


                if (counter == n) {
                    calculateMiles();

                    String num = br.readLine();

                    if (num != null) {
                        int n2 = Integer.parseInt(num);
                        n = n2;
                        counter = 0;
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void calculateMiles() {
        int miles = 0;

        for (int i = 0; i < speed.size(); i++) {
            if (i == 0) {
                miles += speed.get(i) * (hour.get(i));
            } else {
                miles += speed.get(i) * (hour.get(i) - hour.get(i - 1));
            }
        }

        speed = new ArrayList<>();
        hour = new ArrayList<>();

        System.out.println(miles + " miles");
    }

    public static void main(String[] args) {
        SpeedLimit speedLimit = new SpeedLimit();
        speedLimit.parse();
    }
}
