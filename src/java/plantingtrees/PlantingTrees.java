import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlantingTrees {
    private List<Integer> trees = new ArrayList<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            String[] t = br.readLine().split( " ");

            for (int i = 0; i < n; i++) {
                trees.add(Integer.parseInt(t[i]));
            }

            Collections.sort(trees, Collections.reverseOrder());

            calcDays(trees);

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private void calcDays(List<Integer> trees) {
        int nbrOfTrees = trees.size();
        int remainingTime = nbrOfTrees-1;

        while (remainingTime > 0) {
            for (int i = 0; i < nbrOfTrees; i++) {
                trees.set(i, trees.get(i) - remainingTime);
                remainingTime--;
            }
        }

        Collections.sort(trees, Collections.reverseOrder());
        System.out.println(trees.get(0) + nbrOfTrees+1);
    }

    public static void main(String[] args) {
        PlantingTrees plantingTrees = new PlantingTrees();
        plantingTrees.parse();
    }
}
