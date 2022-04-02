import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Avion {
    private List<Integer> indexes = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String line;

            for (int i = 1; i < 6; i++) {
                line = br.readLine();

                if (line.contains("FBI")) {
                    indexes.add(i);
                }
            }

            if (indexes.isEmpty()) {
                System.out.println("HE GOT AWAY!");
            } else {
                System.out.println(Arrays.toString(indexes.toArray()).replace("[", "").replace("]", "").replace(",", ""));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Avion avion = new Avion();
        avion.parse();
    }

}
