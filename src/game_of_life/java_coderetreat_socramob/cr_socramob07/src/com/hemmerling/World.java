package com.hemmerling;

public class World {

	private boolean[][] worldGrid = new boolean[3][3]; // default init auf false
	
	public boolean isSomebodyAlive() {
		return false;
	}

	public boolean isCellAlive(int coordX, int coordY) {
		// TODO Auto-generated method stub
		boolean isAlive = worldGrid[coordX][coordY];
		return isAlive;
	}

//	public boolean setCellAlive(int coordX, int coordY) {
//		// TODO Auto-generated method stub
//		worldGrid[coordX][coordY] = true;
//		return this.isCellAlive(coordX, coordY);
//	}
//
//	public boolean setCellDead(int coordX, int coordY) {
//		// TODO Auto-generated method stub
//		worldGrid[coordX][coordY] = false;
//		return this.isCellAlive(coordX, coordY);
//	}
	public boolean setCellState(boolean state, int coordX, int coordY) {
		// TODO Auto-generated method stub
		worldGrid[coordX][coordY] = state;
		return this.isCellAlive(coordX, coordY);
	}
}
