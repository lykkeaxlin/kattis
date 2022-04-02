import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tri {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] line = br.readLine().split(" ");

            StringBuilder sb = new StringBuilder();

            int n1 = Integer.parseInt(line[0]);
            int n2 = Integer.parseInt(line[1]);
            int n3 = Integer.parseInt(line[2]);

            if (n1 + n2 == n3) {
                sb.append(n1 + "+" + n2 + "=" + n3);
            } else if (n1 - n2 == n3) {
                sb.append(n1 + "-" + n2 + "=" + n3);
            } else if (n2 + n3 == n1) {
                sb.append(n1 + "=" + n2 + "+" + n3);
            } else if (n1 == n2 - n3) {
                sb.append(n1 + "=" + n2 + "-" + n3);
            } else if (n1 / n2 == n3 && n1 % n2 == 0) {
                sb.append(n1 + "/" + n2 + "=" + n3);
            } else if (n2 / n3 == n1 && n2 % n3 == 0) {
                sb.append(n1 + "=" + n2 + "/" + n3);
            } else if (n1 * n2 == n3) {
                sb.append(n1 + "*" + n2 + "=" + n3);
            } else {
                sb.append(n1 + "=" + n2 + "*" + n3);
            }

            System.out.println(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tri tri = new Tri();
        tri.parse();
    }
}
