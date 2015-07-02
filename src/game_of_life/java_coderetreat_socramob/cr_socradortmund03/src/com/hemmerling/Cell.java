package com.hemmerling;

public class Cell {

	public enum state { alive, dead }


	public state myState;
	public state myNextState;

	public enum neighbours { oneOrLess, two, three, fourOrMore }
	public neighbours myNeighbours;

	public Cell()
	{
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
	}


	public Object isAlive() {
		// TODO Auto-generated method stub
		return myState == Cell.state.alive;
	}

	public Object nextState() {
		// TODO Auto-generated method stub
		if ( myNeighbours == Cell.neighbours.two ||
	       myNeighbours == Cell.neighbours.three )
	       return Cell.state.alive;
		else
		   return Cell.state.dead;
	}

}
