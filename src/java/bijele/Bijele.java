import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bijele {
    int king;
    int queen;
    int rooks;
    int bishop;
    int knight;
    int pawn;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;

            try {
                line = br.readLine().split(" ");

                king = 1 - Integer.parseInt(line[0]);
                queen = 1 - Integer.parseInt(line[1]);
                rooks = 2 - Integer.parseInt(line[2]);
                bishop = 2 - Integer.parseInt(line[3]);
                knight = 2 - Integer.parseInt(line[4]);
                pawn = 8 - Integer.parseInt(line[5]);

            } catch (IOException e1) {
                e1.printStackTrace();
            }

    }

    public void print() {

        System.out.println(king + " " + queen + " " + rooks + " " + bishop + " " + knight + " " + pawn);
    }


    public static void main(String[] args) {
        Bijele bijele = new Bijele();
        bijele.parse();
        bijele.print();
    }
}
