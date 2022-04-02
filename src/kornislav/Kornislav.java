import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kornislav {
    private List<Integer> sides = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] line = br.readLine().split(" ");

            for (int i = 0; i < line.length; i++) {
                sides.add(Integer.parseInt(line[i]));
            }

            Collections.sort(sides, Collections.reverseOrder());

            if (sides.get(3) == 0) {
                System.out.println(0);
            } else {
                int area = sides.get(1) * sides.get(3);
                System.out.println(area);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Kornislav kornislav = new Kornislav();
        kornislav.parse();
    }
}
