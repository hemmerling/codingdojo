package hackcamp2016s2;

public class Board {
	private boolean[][] newBoard;
	private static boolean[][] oldBoard;
	
	
	public Board(int ausdehnungX) {
		oldBoard = newBoard;
		newBoard = new boolean[ausdehnungX][ausdehnungX];
	}
	
	public static void setAlive(int x, int y) {
		newBoard[x][y] = true;
	}
	
	
	public Board evolve() {
		// calculation, with result:
		for (int ii = 0; ii< 3; ii++){
			for (int jj = 0; jj< 3; jj++){ {
				// teste board(ii,jj)
				int number = 0;
				if (oldBoard[ii-1][jj-1]) {
				  number+=1;
				}
		}
		newBoard[1][1] = false;
		return this;
	}
	
	public boolean[][] getArray() {
		return newBoard;
	}

	public static void main(String[] args) {
		setAlive(1,1);
		
	}
}
