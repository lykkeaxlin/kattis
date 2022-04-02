import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetailedDifferences {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                compare(br.readLine().toCharArray(), br.readLine().toCharArray());

                if (i + 1 != n) {
                    System.out.println(" ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void compare(char[] c1, char[] c2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < c1.length; i++) {

            if (c1[i] == c2[i]) {
                sb.append('.');
            } else {
                sb.append('*');
            }
        }

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        DetailedDifferences detailedDifferences = new DetailedDifferences();
        detailedDifferences.parse();
    }
}
