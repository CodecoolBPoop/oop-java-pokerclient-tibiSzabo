import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PokerClient {

private List<Card> opponentCards = new ArrayList<>();

    PokerClient(String p1, String p2, String p3, String p4, String p5) {
        List<String> params = Arrays.asList(p1, p2, p3, p4, p5);
        for (String cardCode: params) {
            opponentCards.add(new Card(cardCode));}
    }

    boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        List<Card> myCards = new ArrayList<>();

        List<String> paramList = Arrays.asList(p1, p2, p3, p4, p5);
        for (String cardCode: paramList) {myCards.add(new Card(cardCode));}

        return
                myCards.stream()
                        .map(card -> card.cardValue)
                        .max(Integer::compareTo)
                        .orElse(0)
                        >
                opponentCards.stream()
                        .map(card -> card.cardValue)
                        .max(Integer::compareTo)
                        .orElse(0);
    }

}