package com.hemmerling.gameoflife.coderetreat03;

public class LebendeZelle {
	private int positionX, positionY;
	
	public LebendeZelle(int positionX, int positionY){
		this.positionX = positionX;
		this.positionY = positionY;
	}

		
	public LebendeZelle getZelle() {
		return this;
	}

	public int getPositionX() {
		return this.positionX;
	}

	public int getPositionY() {
		return this.positionY;
	}

	public void setZelle(int positionX, int positionY){
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public boolean istNachbar(LebendeZelle fremdeZelle) {
		return ( Math.abs(positionX - fremdeZelle.getPositionX()) == 1 ) || 
			   ( Math.abs(positionY - fremdeZelle.getPositionY()) == 1 );
	}

}
