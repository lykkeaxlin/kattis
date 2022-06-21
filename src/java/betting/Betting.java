package betting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Betting {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int a = Integer.parseInt(br.readLine());
            System.out.println((double) 100/a);
            System.out.println((double) 100/(100-a));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Betting().parse();
    }
}
