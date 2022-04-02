import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Cetvrta {
    private static Stack<Integer> xCoordinates = new Stack<>();
    private static Stack<Integer> yCoordinates = new Stack<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {

            while ((line = br.readLine()) != null) {
                String[] coordinates = line.split(" ");
                xCoordinates.push(Integer.parseInt(coordinates[0]));
                yCoordinates.push(Integer.parseInt(coordinates[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int xCoordinate() {
        int x = xCoordinates.pop();

        if (!xCoordinates.contains(x)) {
            return x;
        } else {

            int x2 = xCoordinates.pop();

            if (x2 == x) {
                return xCoordinates.pop();
            } else {
                return x2;
            }
        }
    }

    public static int yCoordinate() {
        int x = yCoordinates.pop();

        if (!yCoordinates.contains(x)) {
            return x;
        } else {

            int x2 = yCoordinates.pop();

            if (x2 == x) {
                return yCoordinates.pop();
            } else {
                return x2;
            }
        }
    }

    public static void main(String[] args) {
        Cetvrta c = new Cetvrta();
        c.parse();

        int xs = c.xCoordinate();
        int ys = c.yCoordinate();
        System.out.println(xs + " " + ys);

    }
}

