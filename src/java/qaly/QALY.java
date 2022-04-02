import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QALY {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float sum = 0;

        try {

            int count = Integer.parseInt(br.readLine());

            for (int i = 0; i < count; i++) {
                String[] nbrs = br.readLine().split(" ");

                sum += Float.parseFloat(nbrs[0]) * Float.parseFloat(nbrs[1]);
            }

            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        QALY qaly = new QALY();
        qaly.parse();
    }
}
