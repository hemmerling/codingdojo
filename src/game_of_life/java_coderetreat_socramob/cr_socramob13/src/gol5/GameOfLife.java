package gol5;

public class GameOfLife {

	private int numberOfNeighbours;
	
	
	public GameOfLife() {
	}
	
	public GameOfLife(int numberOfNeighbours) {
		// TODO Auto-generated method stub
		this.numberOfNeighbours = numberOfNeighbours;
	}

	public int numberOfNeighboursFunction(int anzahl) {
		return anzahl;
	}
	
	public boolean myCellLivesInNextGeneration() {
		boolean result = false;
		if (this.numberOfNeighbours ==3) {
			result = true;
		}
	   return result;
	}
	
	public boolean myCellLivesInNextGenerationParameter(int numberOfNeighbours) {
		boolean result = false;
		if (numberOfNeighbours ==3) {
			result = true;
		}
	   return result;
	}
}
