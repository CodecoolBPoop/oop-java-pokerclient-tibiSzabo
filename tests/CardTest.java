import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void cardConstructorInvalidArgumentThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {Card testCard = new Card("z4");});
        assertThrows(IllegalArgumentException.class, () -> {Card testCard = new Card("s16");});
        assertThrows(IllegalArgumentException.class, () -> {Card test = new Card("@2");});
        assertThrows(IllegalArgumentException.class, () -> {Card test = new Card("-1");});
    }

    @Test
    void cardHasCorrectCardCode() {
        Card testCard;

        testCard = new Card("s6");
        assertEquals(testCard.cardCode, "s6");

        testCard = new Card("sk");
        assertEquals(testCard.cardCode, "sk");
    }

    @Test
    void cardGetValueReturnsCorrectResult() {
        Card testCard;

        testCard = new Card("s6");
        assertEquals(testCard.getValue(), 6);

        testCard = new Card("sk");
        assertEquals(testCard.getValue(), 13);

        testCard = new Card("cq");
        assertEquals(testCard.getValue(), 12);
    }

}