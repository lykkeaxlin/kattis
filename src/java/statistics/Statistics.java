import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics {
    private int min = 1000000;
    private int max = -1000000;
    private int range = 0;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        int testCase = 1;

        try {

            while ((line = br.readLine()) != null) {
                String[] splitted = line.split(" ");
                reset();

              for (int j = 1; j < splitted.length; j++) {
                  int temp = Integer.parseInt(splitted[j]);

                  if (temp < min) {
                      min = temp;
                  }

                  if (temp > max) {
                      max = temp;
                  }
              }

              range = Math.abs(max - min);

              System.out.println("Case " + testCase + ": " + min + " " + max + " " + range);
              testCase++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void reset() {
        min = 1000000;
        max = -1000000;
        range = 0;
    }

    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.parse();
    }
}
