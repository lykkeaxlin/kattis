import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFun {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String[] nbrs = br.readLine().split(" ");

                int x = Integer.parseInt(nbrs[0]);
                int y = Integer.parseInt(nbrs[1]);
                int z = Integer.parseInt(nbrs[2]);

                boolean answer = isPossible(x, y, z);

                if (answer) {
                    System.out.println("Possible");
                } else {
                    System.out.println("Impossible");
                }
            }

            } catch(IOException e){
                e.printStackTrace();
            }
        }


   private boolean isPossible(int x, int y, int z) {
        if (x + y == z || Math.abs(x-y) == z || x * y == z || (x / y) == z && x % y == 0 || (y / x) == z && y % x == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        NumberFun numberFun = new NumberFun();
        numberFun.parse();
    }
}
