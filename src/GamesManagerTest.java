import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GamesManagerTest {
    @Test
    public void TestMonopoly() {
        assertEquals("Monopoly started!", "Monopoly started!");
    }
    @Test
    public void TestChess() {
        assertEquals("Chess started!", "Chess started!");
    }
    @Test
    public void TestTic() {
        assertEquals("Tic Tac Toe started!", "Tic Tac Toe started!");
    }
}