package onechicken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OneChicken {
    private int nbrOfPeople;
    private int nbrOfChickens;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] input = br.readLine().split(" ");
            nbrOfPeople = Integer.parseInt(input[0]);
            nbrOfChickens = Integer.parseInt(input[1]);

            int difference = Math.abs(nbrOfPeople - nbrOfChickens);

            if (difference == 1) {
                if (nbrOfChickens > nbrOfPeople) {
                    System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
                } else {
                    System.out.println("Dr. Chaz needs 1 more piece of chicken!");
                }
            } else {
                if (nbrOfChickens > nbrOfPeople) {
                    System.out.println("Dr. Chaz will have " + difference + " pieces of chicken left over!");
                } else {
                    System.out.println("Dr. Chaz needs " + difference + " more pieces of chicken!");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OneChicken oneChicken = new OneChicken();
        oneChicken.parse();
    }
}
