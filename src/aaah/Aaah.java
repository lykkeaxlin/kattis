package aaah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aaah {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String actual = br.readLine();
            String expectation = br.readLine();

            if (actual.length() >= expectation.length()) {
                System.out.println("go");
            } else {
                System.out.println("no");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Aaah aaah = new Aaah();
        aaah.parse();
    }
}
