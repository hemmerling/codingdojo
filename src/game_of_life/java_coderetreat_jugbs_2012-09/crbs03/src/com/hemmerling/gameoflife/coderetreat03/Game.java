package com.hemmerling.gameoflife.coderetreat03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Game {
    
	private List<LebendeZelle> gameGrid;

	public Game(List<LebendeZelle> gameGrid){		
	}
	
	public Game(){
		gameGrid = new ArrayList<LebendeZelle>();
	}
	
	public Game next(){
		//gameGrid.clear(); // weil nur 1 Zelle im System
		// Schleife über alle Elemente
		List<LebendeZelle> ueberlebendeZellen = new ArrayList<LebendeZelle>();
		for (LebendeZelle zelle : gameGrid) {
			int anzahlNachbarn = ermittleNachbarn(zelle);
			if (anzahlNachbarn < 2) {
				ueberlebendeZellen.add(zelle);
			};
		};
		gameGrid = ueberlebendeZellen;
		
		return this;
	}
	
	private int ermittleNachbarn(LebendeZelle zelle) {
		// Prüfe für jedes Element, wieviel Nachbarn es hat 
		for (LebendeZelle fremdeZelle : gameGrid) {
			 
		}
		return 0;
	}

	public LebendeZelle getElement(int index) {
		return gameGrid.size() > index ? gameGrid.get(index) : null; 
	}
	
	public LebendeZelle addElement(LebendeZelle lebendeZelle){
		
		gameGrid.add(lebendeZelle);
	    return lebendeZelle ;
	}
	
	public LebendeZelle  addElement(int positionX, int positionY){
		LebendeZelle lebendeZelle = new LebendeZelle(positionX, positionY);
		gameGrid.add(lebendeZelle);
		return lebendeZelle ;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
