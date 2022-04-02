import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhatDoesTheFoxSay {
    private List<String> sounds = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                sounds = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));

                while (!(line = br.readLine()).equals("what does the fox say?")) {
                    String[] splitted = line.split(" ");
                    sounds.removeIf(splitted[2]::equals);
                }
                System.out.println(sounds.toString().replace("[","").replace("]", "").replace(",", ""));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WhatDoesTheFoxSay whatDoesTheFoxSay = new WhatDoesTheFoxSay();
        whatDoesTheFoxSay.parse();
    }
}
