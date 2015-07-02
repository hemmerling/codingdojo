package com.hemmerling;

public class Cell {

	public int numberOfNeighbours;
	public boolean ripStatus;
	
	public Cell(int number){
		numberOfNeighbours = number;
	}

	
	public Cell(boolean rip, int number) {
		// TODO Auto-generated constructor stub
		numberOfNeighbours = number;
		ripStatus = rip;
	}


	public boolean isAlive(){
		boolean status = numberOfNeighbours>=2 && numberOfNeighbours<4;
		if (( ripStatus == false) && (numberOfNeighbours==2)) {
			status = false;
		}
		return (status);
	}
}
