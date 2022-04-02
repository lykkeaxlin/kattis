import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filip {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

           String[] ints = br.readLine().split(" ");

           int n1 = reverse(Integer.parseInt(ints[0]));
           int n2 = reverse(Integer.parseInt(ints[1]));

            System.out.println(Math.max(n1, n2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int reverse(int nbr) {

        int n = 0;

        while (nbr != 0) {
            int digit = nbr % 10;
            n = n * 10 + digit;
            nbr /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Filip filip = new Filip();
        filip.parse();
    }
}

