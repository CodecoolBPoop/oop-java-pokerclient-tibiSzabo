import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {
    @Test
    void pokerClientHighestCardIsMineReturnsCorrectValue() {
        PokerClient pokerClientTest;

        pokerClientTest = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertTrue(pokerClientTest.highestCardIsMine("s3", "h4", "s5", "d6", "sj"));

        pokerClientTest = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertFalse(pokerClientTest.highestCardIsMine("s3", "h4", "s5", "d6", "sk"));
    }
}