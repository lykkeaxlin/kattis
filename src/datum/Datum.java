import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Datum {

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] line = br.readLine().split(" ");

            String day = line[0];
            String month = line[1];

            getDate(day + "/" + month + "/" + "2009");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void getDate(String day) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat( "dd/MM/yy", Locale.ENGLISH );
        java.util.Date date = df.parse(day);
        df.applyPattern( "EEEE" );
        System.out.println(df.format(date));
    }


    public static void main(String[] args) throws ParseException {
        Datum datum = new Datum();
        datum.parse();
    }
}
