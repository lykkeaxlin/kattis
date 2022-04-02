
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BookingARoom {
    List availableRooms = new ArrayList();

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

        String[] line = br.readLine().split(" ");

        int nbrOfRooms = Integer.parseInt(line[0]);
        int nbrOfBookedRooms = Integer.parseInt(line[1]);

        if (nbrOfRooms == nbrOfBookedRooms) {
            System.out.println("too late");
        } else {

            fillSet(nbrOfRooms);

            for (int i = 0; i < nbrOfBookedRooms; i++) {
                availableRooms.remove(availableRooms.indexOf(Integer.parseInt(br.readLine())));
            }

            System.out.println(availableRooms.get(0));
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fillSet(int nbrOfRooms) {

        for (int i = 1; i < nbrOfRooms + 1; i++) {
            availableRooms.add(i);
        }
    }

    public static void main(String[] args) {
        BookingARoom bookingARoom = new BookingARoom();
        bookingARoom.parse();
    }
}


