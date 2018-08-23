import java.util.HashMap;

public class Card {

    String cardCode;
    String cardColor;
    int cardValue;

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;

        String validCardColors = "SCDH";
        this.cardColor = this.cardCode.substring(0, 1).toUpperCase();

        if (!validCardColors.contains(cardColor))
        {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }

        String givenCardValue = cardCode.substring(1).toUpperCase();
        HashMap<String, Integer> alphabeticCardValues = new HashMap<>();
        alphabeticCardValues.put("J", 11);
        alphabeticCardValues.put("Q", 12);
        alphabeticCardValues.put("K", 13);
        alphabeticCardValues.put("A", 14);

        if (alphabeticCardValues.get(givenCardValue) == null) {
            this.cardValue = Integer.parseInt(givenCardValue);
            if (this.cardValue > 10 || this.cardValue < 2) {
                throw new IllegalArgumentException("card number isn't valid: " + this.cardValue);
            }
        } else {
            this.cardValue = alphabeticCardValues.get(givenCardValue);
        }

    }

    public int getValue() {
        return this.cardValue;
    }
}
