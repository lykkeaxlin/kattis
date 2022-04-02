import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ACM {
    private String[] input;
    private int n;
    private Map<String, Integer> rightScores = new HashMap<>();
    private Map<String, Integer> wrongScores = new HashMap<>();
    private int score = 0;
    private int nbrOfSolvedProblems = 0;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            input = br.readLine().split(" ");

            n = Integer.parseInt(input[0]);

            while (n != -1) {

                String problem = input[1];
                String correctness = input[2];

                if (correctness.equals("right")) {
                    rightScores.put(problem, n);
                    score += n;
                    nbrOfSolvedProblems++;
                } else {
                    int prev = wrongScores.getOrDefault(problem, 0);
                    wrongScores.put(problem, prev + 20);
                }

                input = br.readLine().split(" ");
                n = Integer.parseInt(input[0]);
            }

            sumScore();
            System.out.println(nbrOfSolvedProblems + " " + score);

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        private void sumScore() {

            for (Map.Entry<String, Integer> entry : wrongScores.entrySet()) {
                if (rightScores.containsKey(entry.getKey())) {
                    score += wrongScores.get(entry.getKey());
                }
            }
        }

        public static void main (String[]args){
            ACM acm = new ACM();
            acm.parse();
        }
    }

