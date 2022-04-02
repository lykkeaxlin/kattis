import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JudgingMoose {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

          String[] line = br.readLine().split(" ");

          if (line[0].equals("0") && line[1].equals("0")) {
              System.out.println("Not a moose");
          } else {
              int i1 = Integer.parseInt(line[0]);
              int i2 = Integer.parseInt(line[1]);

              if (i1 == i2) {
                  System.out.println("Even " + i1*2);
              } else {
                    int max = Math.max(i1, i2);
                  System.out.println("Odd " + max*2);
              }
          }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JudgingMoose judgingMoose = new JudgingMoose();
        judgingMoose.parse();
    }
}
