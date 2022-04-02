import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Modulo {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> input = new HashSet<>();

        try {

            for (int i = 0; i < 10; i++) {
                input.add(Integer.parseInt(br.readLine()) % 42);
            }

            System.out.println(input.size());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Modulo modulo = new Modulo();
        modulo.parse();
    }
}
