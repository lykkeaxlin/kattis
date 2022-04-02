import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PizzaCrust {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] nbrs = br.readLine().split(" ");
           int r = Integer.parseInt(nbrs[0]);
           int c = Integer.parseInt(nbrs[1]);

            cheeseRatio(r,c);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cheeseRatio(int r, int c) {

        if (r == c) {
            System.out.println("0.000000000");
        } else {

            NumberFormat df = new DecimalFormat("#.000000");

            double area = Math.PI * (Math.pow(r, 2));
            double areaWithCheese = Math.PI * (Math.pow((r - c), 2));

            double answer = (areaWithCheese / area) * 100;

            System.out.print((df.format(answer)).replace(",", "."));
        }
    }

    public static void main(String[] args) {
        PizzaCrust pizzaCrust = new PizzaCrust();
        pizzaCrust.parse();
    }
}
