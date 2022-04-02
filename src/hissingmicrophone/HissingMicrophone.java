import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HissingMicrophone {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            char[] word = br.readLine().toCharArray();

            checkInput(word);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkInput(char[] input) {
        boolean hiss = false;

        for (int i = 0; i + 1 < input.length; i++) {
            if (input[i] == 's' && input[i+1] == 's') {
                hiss = true;
            }
        }
        print(hiss);
    }

    public void print(boolean b) {
        if (b) {
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }


    public static void main(String[] args) {
        HissingMicrophone hissingMicrophone = new HissingMicrophone();
        hissingMicrophone.parse();
    }
}
