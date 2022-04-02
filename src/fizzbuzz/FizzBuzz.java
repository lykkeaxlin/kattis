import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
    private int x;
    private int y;
    private int n;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;

        try {

            line = br.readLine().split(" ");

            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);
            n = Integer.parseInt(line[2]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {

        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0) {
                System.out.println("FizzBuzz");
            } else if (i % x == 0) {
                System.out.println("Fizz");
            } else if (i % y == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.parse();
        fb.print();
    }

}
