package com.hemmerling;

public class Cell {
	protected boolean isAlive;
	
	public Cell(boolean alive)
	{
		this.isAlive = alive;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public static Cell deadCell(){
		return new Cell(false);
	}
	
	public static Cell aliveCell(){
		return new Cell(true);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
	}

}
