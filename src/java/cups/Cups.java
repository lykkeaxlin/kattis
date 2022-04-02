import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Map;
        import java.util.TreeMap;

public class Cups {
    Map<Integer, String> cups = new TreeMap<>();


    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                String[] line = br.readLine().split(" ");

                if (isNumeric(line[0])) {
                    cups.put(Integer.parseInt(line[0]) / 2, line[1]);
                } else {
                    cups.put(Integer.parseInt(line[1]), line[0]);
                }
            }

            for (Map.Entry<Integer, String> entry : cups.entrySet()) {
                System.out.println(entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Cups cups = new Cups();
        cups.parse();
    }
}
