package addtwonumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class AddTwoNumbers {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int[] nbrs = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = Arrays.stream(nbrs).reduce(0, Integer::sum);
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new AddTwoNumbers().parse();
    }
}
