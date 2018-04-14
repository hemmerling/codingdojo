package com.hemmerling;

public class Cell {
	
	boolean isAlive = true; 
	int anzahlLebenderNachbarn;
	
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return this.isAlive;
	}

	public void setAlive(boolean b) {
		// TODO Auto-generated method stub
		isAlive = b;
	}

	public int getAnzahlLebenderNachbarn() {
		// TODO Auto-generated method stub
		return anzahlLebenderNachbarn;
	}

	public void setAnzahlLebenderNachbarn(int anzahlLebenderNachbarn) {
		this.anzahlLebenderNachbarn = anzahlLebenderNachbarn;		
	}

	public boolean ueberlebtDieZelle() {
		// TODO Auto-generated method stub
		return ( anzahlLebenderNachbarn == 3 ) || 
				(( anzahlLebenderNachbarn == 2 ) && isAlive);

	}
	
	

}
