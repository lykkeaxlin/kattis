import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProvincesAndGold {
    private int buyingPower;

    public void parse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String[] line = br.readLine().split(" ");

            int gold = Integer.parseInt(line[0]);
            int silver = Integer.parseInt(line[1]);
            int copper = Integer.parseInt(line[2]);

            buyingPower = calcBuyingPower(gold, silver, copper);

            String victoryCard = selectVictoryCard();
            String treasureCard = selectTreasureCard();

            if (!victoryCard.isEmpty()) {
                System.out.println(victoryCard + " or " + treasureCard);
            } else {
                System.out.println(treasureCard);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int calcBuyingPower(int gold, int silver, int copper) {
        return (gold * 3) + (silver * 2) + copper;
    }

    public String selectVictoryCard() {

        if (buyingPower >= 8) {
            return "Province";
        } else if (buyingPower >= 5) {
            return "Duchy";
        } else if (buyingPower >= 2) {
            return "Estate";
        } else {
            return "";
        }
    }

    public String selectTreasureCard() {
        if (buyingPower >= 6) {
            return "Gold";
        } else if (buyingPower >= 3) {
            return "Silver";
        } else {
            return "Copper";
        }
    }

    public static void main(String[] args) {
        ProvincesAndGold provincesAndGold = new ProvincesAndGold();
        provincesAndGold.parse();
    }
}
