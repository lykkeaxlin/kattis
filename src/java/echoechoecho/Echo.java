package echoechoecho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Echo {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String word = br.readLine();
            String repeated = String.join(" ", Collections.nCopies(3, word));
            System.out.println(repeated);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Echo().parse();
    }
}
