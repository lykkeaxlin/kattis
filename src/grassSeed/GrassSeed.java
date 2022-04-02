import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrassSeed {
    private double totalCost = 0;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            double cost = Double.parseDouble(br.readLine());

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                String[] lawn = br.readLine().split(" ");

                double width = Double.parseDouble(lawn[0]);
                double length = Double.parseDouble(lawn[1]);

                totalCost += (cost * calculateArea(width, length));
            }

            System.out.println(totalCost);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double calculateArea(double width, double length) {
        return width*length;
    }

   public static void main(String[] args) {
        GrassSeed grassSeed = new GrassSeed();
        grassSeed.parse();
   }
}
