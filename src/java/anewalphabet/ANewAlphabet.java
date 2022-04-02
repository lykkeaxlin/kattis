import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ANewAlphabet {
    Map<Character, String> lexikon = new HashMap<>();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        lexikon.put('a', "@");
        lexikon.put('b', "8");
        lexikon.put('c', "(");
        lexikon.put('d', "|)");
        lexikon.put('e', "3");
        lexikon.put('f', "#");
        lexikon.put('g', "6");
        lexikon.put('h', "[-]");
        lexikon.put('i', "|");
        lexikon.put('j', "_|");
        lexikon.put('k', "|<");
        lexikon.put('l', "1");
        lexikon.put('m', "[]\\/[]");
        lexikon.put('n', "[]\\[]");
        lexikon.put('o', "0");
        lexikon.put('p', "|D");
        lexikon.put('q', "(,)");
        lexikon.put('r', "|Z");
        lexikon.put('s', "$");
        lexikon.put('t', "']['");
        lexikon.put('u', "|_|");
        lexikon.put('v', "\\/");
        lexikon.put('w', "\\/\\/");
        lexikon.put('x', "}{");
        lexikon.put('y', "`/");
        lexikon.put('z', "2");

        try {
            String line = br.readLine().toLowerCase();

            translate(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void translate(String line) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (lexikon.containsKey(c)) {
                sb.append(lexikon.get(c));
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        ANewAlphabet aNewAlphabet = new ANewAlphabet();
        aNewAlphabet.parse();
    }
}
