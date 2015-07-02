package com.hemmerling;

public class Cell {

	private boolean isAlive = true;
	private int numberOfNeighbours = 0;

	public Cell() {
		this.isAlive = true;
		this.numberOfNeighbours = 0;
	}

	public Cell(int numberOfNeighbours) {
		this.isAlive = true;
		if (numberOfNeighbours < 0) {
			throw new IllegalArgumentException(
					"Number of neighbos needs to be positive");
		}
	}

	public boolean isAlive() {
		this.isAlive = false;
		this.isAlive = !(this.numberOfNeighbours < 2);
		return this.isAlive;
	}
}
