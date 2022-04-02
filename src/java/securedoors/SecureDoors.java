import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SecureDoors {
    private Set<String> entered = new HashSet<>();
    private Set<String> exited = new HashSet<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                String[] line = br.readLine().split(" ");
                String name = line[1];

                if (line[0].equals("entry")) {
                    sb.append(name + " entered ");

                    if (entered.contains(name)) {
                        sb.append("(ANOMALY)");
                    }

                    entered.add(name);
                    exited.remove(name);

                } else {
                    sb.append(name + " exited ");

                    if (!entered.contains(name)) {
                        sb.append("(ANOMALY)");
                    }

                    exited.add(name);
                    entered.remove(name);
                }
                System.out.println(sb.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SecureDoors secureDoors = new SecureDoors();
        secureDoors.parse();
    }
}
