package com.hemmerling.gameoflife.coderetreat01;

public class Zelle {

	private boolean lebenStatus;
	private int anzahlNachbarn;
	private Zelle myNachbar;

	public void setLebensStatus(boolean b) {
		this.lebenStatus = b;
		
	}

	public void setNachbarn(int i) {
		this.anzahlNachbarn = i;
		
	}

	public void naechsteGeneration() {
		if (lebenStatus) {
			setLebensStatus((anzahlNachbarn >1) && (anzahlNachbarn <4));
		} else {
			setLebensStatus(anzahlNachbarn == 3);
		}
//		SetLebensStatus(true);
		
	}

	public boolean getLebensStatus() {
		 return lebenStatus;
	}

	public void setNachbar(Zelle nachbar) {
		myNachbar = nachbar;
		anzahlNachbarn++;
		// TODO Auto-generated method stub
		
	}

	public Zelle getNachbar() {
		// TODO Auto-generated method stub
		return myNachbar;
	}

}
