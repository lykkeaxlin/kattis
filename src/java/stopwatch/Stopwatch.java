package stopwatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stopwatch {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            if (n % 2 != 0) {
                System.out.println("still running");
            } else {
                int counter = 0;


                for (int i = 0; i < n/2; i++) {
                    int start = Integer.parseInt(br.readLine());
                    int stop = Integer.parseInt(br.readLine());
                    counter += stop - start;
                }
                System.out.println(counter);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.parse();
    }
}
