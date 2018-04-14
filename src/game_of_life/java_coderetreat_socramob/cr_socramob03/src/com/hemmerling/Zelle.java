package com.hemmerling;

public class Zelle {

	private boolean isAlive = false;
	private boolean hasNeighbor = false;
	private int numberOfNeigbors = 0;

	public Zelle() {
		isAlive = true;
		numberOfNeigbors = 0;
	}

	public int getNumberOfNeighbors() {
		// TODO Auto-generated method stub
		return numberOfNeigbors;
	}

	public boolean isAlive() {
		// TODO Auto-generated method stub
		return isAlive;
	}

	public void addNeighbor(Zelle nachbar) {
		this.hasNeighbor = true;
		this.numberOfNeigbors++;
	}

}
