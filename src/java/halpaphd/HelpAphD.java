import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelpAphD {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

         int n = Integer.parseInt(br.readLine());
         String line;

         for (int i = 0; i < n; i++) {

             if ((line = br.readLine()).startsWith("P")) {
                 System.out.println("skipped");
             } else {
                 String[] nbrs = line.split("\\+");
                 int i1 = Integer.parseInt(nbrs[0]);
                 int i2 = Integer.parseInt(nbrs[1]);

                 System.out.println(i1 + i2);

             }
         }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HelpAphD helpAphD = new HelpAphD();
        helpAphD.parse();

    }
}
