import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ABC {
    List<Integer> list = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] ints = br.readLine().split(" ");
            char[] order = br.readLine().toCharArray();

            for (int i = 0; i < ints.length; i++) {
                list.add(Integer.parseInt(ints[i]));
            }

            int a = Collections.min(list);
            list.remove(list.indexOf(a));

            int c = Collections.max(list);
            list.remove(list.indexOf(c));

            int b = list.get(0);

            for (int i = 0; i < order.length; i++) {
                if (order[i] == 'A') {
                    System.out.print(a);
                } else if (order[i] == 'B') {
                    System.out.print(b);
                } else {
                    System.out.print(c);
                }

                if (i + 1 != order.length) {
                    System.out.print(" ");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.parse();
    }
}
