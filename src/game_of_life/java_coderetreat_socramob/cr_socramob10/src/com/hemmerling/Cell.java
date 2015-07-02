package com.hemmerling;

public class Cell {

	boolean _isAlive = false;
	int numberOfNeighbours = 0;
	
	public Cell(boolean _isAlive, int numberOfNeighbours) {
		this._isAlive = _isAlive;
		this.numberOfNeighbours = numberOfNeighbours;
	}

	public Cell() {
	}

	public boolean isAlive() {
		return _isAlive;
	}

	public boolean nextStep() {
		// TODO Auto-generated method stub
		this._isAlive = 
				(this.numberOfNeighbours == 3) || 
				((this.numberOfNeighbours == 2) && this._isAlive);
		return this._isAlive;
	}

}
