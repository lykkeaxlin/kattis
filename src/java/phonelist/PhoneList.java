import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PhoneList {
    private List<String> phoneNumbers;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int testCases = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCases; i++) {
                int nbrOfPeople = Integer.parseInt(br.readLine());
                phoneNumbers = new ArrayList<>();

                for (int j = 0; j < nbrOfPeople; j++) {
                    phoneNumbers.add((br.readLine()));
                }

                Collections.sort(phoneNumbers);
                System.out.println(determineConsistency() ? "YES" : "NO");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean determineConsistency() {

        for (int i = 0; i < phoneNumbers.size() - 1 ; i++) {
            String prefix = phoneNumbers.get(i);

            if (phoneNumbers.get(i + 1).startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PhoneList phoneList = new PhoneList();
        phoneList.parse();
    }
}
