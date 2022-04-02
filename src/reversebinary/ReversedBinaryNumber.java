import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedBinaryNumber {

    private void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int nbr = Integer.parseInt(br.readLine());

            String binaryString = Integer.toBinaryString(nbr);

            //int binary = decimalToBinary(binaryString);

            String reversed = reverse(binaryString);
            int newNum = binaryToDecimal(reversed);

            System.out.println(newNum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   /* private long decimalToBinary(long decimal) {
        return Long.parseLong(Long.toString(decimal, 2));
    }*/

    private String reverse(String binary) {
        StringBuilder sb = new StringBuilder();

        for (int i = binary.length() - 1; i >= 0; i--) {
            sb.append(binary.charAt(i));
        }
        return sb.toString();
    }

    private int binaryToDecimal(String reversedBinary) {
        return Integer.parseInt(reversedBinary, 2);
    }

    public static void main(String[] args) {
        ReversedBinaryNumber reversedBinaryNumber = new ReversedBinaryNumber();
        reversedBinaryNumber.parse();
    }
}
