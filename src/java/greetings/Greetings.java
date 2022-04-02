package greetings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greetings {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(createResponse(br.readLine()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String createResponse(String s) {
        StringBuilder response = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            response.append(current);

            if (current == 'e') {
                response.append(current);
            }
        }
        return response.toString();
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        greetings.parse();
    }
}
