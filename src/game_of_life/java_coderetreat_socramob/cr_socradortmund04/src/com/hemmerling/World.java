package com.hemmerling;

public class World {

	private CellState myCellState = CellState.DEAD;
	private int countNeighbors = 0;

	public World nextGeneration() {
		return this;
	}

	public CellState cellState() {

		if (countNeighbors == 3) {
			return CellState.ALIVE;
		} else if (myCellState == CellState.ALIVE ) {
			return CellState.ALIVE;
		}
		return CellState.DEAD;

	}

	public void addNeighbor(MyCell cell) {
		countNeighbors++;
	}

	public void add(MyCell cell) {
		myCellState = CellState.ALIVE;
	}

}
