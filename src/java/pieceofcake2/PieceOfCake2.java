import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PieceOfCake2 {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int h = Integer.parseInt(input[1]);
            int v = Integer.parseInt(input[2]);
            int w = 4;

            int area1 = v*h*4;
            int area2 = ((n-h)*v)*4;
            int area3 = ((n-v)*h)*4;
            int area4 = ((n-h)*(n-v))*4;

            int max = Math.max(area1, Math.max(area2, Math.max(area3, area4)));

            System.out.println(max);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PieceOfCake2 pieceOfCake2 = new PieceOfCake2();
        pieceOfCake2.parse();
    }
}
