import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class HeartRate {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {

                String[] line = br.readLine().split(" ");
                calculateHeartRate(Double.parseDouble(line[0]), Double.parseDouble(line[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void calculateHeartRate(double b, double p) {

        DecimalFormat df = new DecimalFormat("#.0000");

        double BPM = BPM(b, p);
        double minABPM = BPM(b-1, p);
        double maxABPM = BPM(b+1, p);

        System.out.println(df.format(minABPM) + " " + df.format(BPM) + " " + df.format(maxABPM));
    }

    private double BPM(double b, double p) {
        return (60 * b)/p;
    }


    public static void main(String[] args) {
        HeartRate heartRate = new HeartRate();
        heartRate.parse();
    }
}
