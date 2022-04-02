import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trik {
    int state = 1;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            char[] input = br.readLine().toCharArray();

            for (char c : input) {

                changeState(c);
            }

            System.out.println(state);

            } catch(IOException e) {
                e.printStackTrace();
            }
        }

    public int changeState(char c) {

        if (state == 1) {
            if (c == 'A') {
                state = 2;
            } else if (c == 'C') {
                state = 3;
            }
            return state;
        }

        if (state == 2) {
            if (c == 'B') {
                state = 3;
            } else if (c == 'A') {
                state = 1;
            }
            return state;
        }

        if (state == 3) {
            if (c == 'C') {
                state = 1;
            } else if (c == 'B') {
                state = 2;
            }
        }
        return state;
    }

    public static void main(String[] args) {
        Trik trik = new Trik();
        trik.parse();
    }
}
