import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Parking2 {

    private void parse() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int nbrOfCases = Integer.parseInt(br.readLine());

            for (int i = 0; i < nbrOfCases; i++) {

                int nbrOfStores = Integer.parseInt(br.readLine());
                String[] stores = br.readLine().split(" ");
                List<Integer> parsedStores = new ArrayList<>();

                for (int j = 0; j < stores.length; j++) {
                    parsedStores.add(Integer.parseInt(stores[j]));
                }

                Collections.sort(parsedStores);
                System.out.println(calcTotDistance(parsedStores, nbrOfStores));
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    private int calcTotDistance(List<Integer> stores, int nbrOfStores) {
        double max = stores.get(nbrOfStores-1);
        double min = stores.get(0);

        double totalDistance = (max - min);

        for (int i = 0; i < stores.size() - 1; i++) {
            totalDistance += (stores.get(i+1) - stores.get(i));
        }
        return (int) totalDistance;
    }

    public static void main(String[] args) {
        Parking2 parking2 = new Parking2();
        parking2.parse();
    }

}



