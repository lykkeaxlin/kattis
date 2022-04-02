package printer_3d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintedStatues {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int neededPrinters = Integer.parseInt(br.readLine());
            int days = 0;

            while ((Math.pow(2,days)/2) < neededPrinters) {
                days++;
            }

            System.out.println(days);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PrintedStatues printedStatues = new PrintedStatues();
        printedStatues.parse();
    }
}
