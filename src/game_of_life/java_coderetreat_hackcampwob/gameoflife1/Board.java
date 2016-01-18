package hackcamp2016s2;

public class Board {
	private boolean[][] board;
	
	
	public Board(int ausdehnungX) {
		board = new boolean[ausdehnungX][ausdehnungX];
	}
	
	public void setAlive(int x, int y) {
		board[x][y] = true;
	}
	
	
	public Board evolve() {
		// calculation, with result:
		board[1][1] = false;
		return this;
	}
	
	public boolean[][] getArray() {
		return board;
	}
}
