import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadrantSelection {
    private int x;
    private int y;


    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
           x = Integer.parseInt(br.readLine());
           y = Integer.parseInt(br.readLine());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int selectQuadrant() {

        if (x > 0 && y > 0) {
            return 1;
        } else if (x > 0 && y < 0) {
            return 4;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        QuadrantSelection qs = new QuadrantSelection();
        qs.parse();
        System.out.println(qs.selectQuadrant());
    }

}
