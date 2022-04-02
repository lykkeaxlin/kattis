import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetSpam {
    private double whiteSpaceCharacters = 0;
    private double lowerCaseLetters = 0;
    private double upperCaseLetters = 0;
    private double symbols = 0;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            char[] line = br.readLine().toCharArray();
            int nbrOfCharacters = line.length;

            for (char c : line) {
                count(c);
            }

            System.out.println(whiteSpaceCharacters/nbrOfCharacters + "\n" + lowerCaseLetters/nbrOfCharacters
                    + "\n" + upperCaseLetters/nbrOfCharacters + "\n" + symbols/nbrOfCharacters);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void count(char c) {
        int isSymbol = 0;

        if (c == '_') {
            whiteSpaceCharacters++;
            isSymbol++;
        }

        if (Character.isLowerCase(c)) {
            lowerCaseLetters++;
            isSymbol++;
        }

        if (Character.isUpperCase(c)) {
            upperCaseLetters++;
            isSymbol++;
        }

        if (isSymbol == 0) {
            symbols++;
        }
    }


    public static void main(String[] args) {
        AlphabetSpam alphabetSpam = new AlphabetSpam();
        alphabetSpam.parse();
    }
}
