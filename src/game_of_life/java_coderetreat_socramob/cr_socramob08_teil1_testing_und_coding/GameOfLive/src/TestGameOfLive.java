import static org.junit.Assert.*;

import org.junit.Test;


public class TestGameOfLive {

	@Test
	public void testNextGenerationReturnsBoard() {
		GameBoard board = new GameBoard();
		GameBoard nextBoard = board.next();
		assertNotNull(nextBoard);
	}
	
	@Test
	public void testSetCellAlive() throws Exception {
		GameBoard board = new GameBoard();
		board.setAlive(1,2);
		assertTrue(board.getAlive(1,2));
	}

}
