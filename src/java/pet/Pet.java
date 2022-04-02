import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pet {
    List<List<Integer>> votes = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        try {

            while ((line = br.readLine()) != null) {

                String[] coordinates = line.split(" ");

                List<Integer> points = new ArrayList<>();

                for (int i = 0; i < coordinates.length; i++) {
                    points.add(Integer.parseInt(coordinates[i]));
                }

                votes.add(points);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void pickWinner() {
        int currentPoints = 0;
        int currentWinner = 0;
        int sum = 0;
        int counter = 1;

        for (List<Integer> list : votes) {
            sum = 0;

            for (Integer i : list) {
                sum += i;
            }

            if (sum > currentPoints) {
                currentPoints = sum;
                currentWinner = counter;
            }
            counter++;
        }

        System.out.println(currentWinner + " " + currentPoints);

    }


    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.parse();
        pet.pickWinner();
    }

}
