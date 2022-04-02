import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LineUp {
    private List<String> names = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                names.add(br.readLine());
            }
            System.out.println(determineOrder(names));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String determineOrder(List<String> names) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;;

        for (int i = 0; i < names.size() - 1; i++) {

            while (isIncreasing || isDecreasing) {
                int difference = names.get(i).compareTo(names.get(i+1));

                if (difference < 0) {
                    isDecreasing = false;
                    break;
                } else if (difference > 0) {
                    isIncreasing = false;
                    break;
                }
            }
        }

        if (isIncreasing) {
            return "INCREASING";
        } else if (isDecreasing) {
            return "DECREASING";
        } else {
            return "NEITHER";
        }
    }

    public static void main(String[] args) {
        LineUp lineUp = new LineUp();
        lineUp.parse();
    }
}
