import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncodedMessage {
    private char[][] matrix;
    private String s;
    private int m;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                s = br.readLine();
                int size = s.length();
                m = (int) Math.sqrt(size);

                matrix = new char[m][m];

                parseMatrix();
                encodeMessage();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void parseMatrix() {

        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.charAt(index++);
            }
        }
    }

    void encodeMessage() {
        StringBuilder sb = new StringBuilder();

            for (int j = m-1; j >= 0; j--) {
                for (int i = 0; i < m; i++) {
                sb.append(matrix[i][j]);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        EncodedMessage encodedMessage = new EncodedMessage();
        encodedMessage.parse();
    }
}
