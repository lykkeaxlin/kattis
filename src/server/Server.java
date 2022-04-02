import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] config = br.readLine().split(" ");
            int target = Integer.parseInt(config[1]);

            String[] tasks = br.readLine().split(" ");

            System.out.println(calcTasks(tasks, target));

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private int calcTasks(String[] tasks, int target) {
        int sum = 0;
        int counter = 0;

        for (int i = 0; i < tasks.length; i++) {

            int x = Integer.parseInt(tasks[i]);

            if (sum + x > target) {
                return counter;
            } else {
                sum += x;
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.parse();
    }
}
