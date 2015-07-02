package com.hemmerling.gameoflife.coderetreat03;


import static org.junit.Assert.*;
import org.junit.Test;

public class GameOfLifeTest {

	// private int aFeld[][] ={ 0,0,0, 0,0,0, 0,0,0};

	
	@Test
	public void gespeichertesElementWirdGefunden() {
		Game aGame= new Game();
		LebendeZelle meineTestZelle = aGame.addElement(1,1);
		aGame.getElement(0);
		assertEquals("Gespeichertes Element ist nicht gleich", 
				meineTestZelle, aGame.getElement(0));
	}

	@Test
	public void einElementUeberlebtNicht() {
		Game aGame= new Game();
		LebendeZelle meineTestZelle = aGame.addElement(1,1);
		aGame = aGame.next();
		assertEquals("Feld ist auch nach Löschen ungleich Null", null, aGame.getElement(0));
	}

	@Test
	public void einElementUeberlebt() {
		Game aGame= new Game();
		aGame.addElement(1,1);
		LebendeZelle meineTestZelle = aGame.addElement(1,2);
		aGame.addElement(1,3);
		aGame = aGame.next();
		assertEquals("Mittlere Zelle hat nicht überlebt", meineTestZelle, aGame.getElement(0));

	}
}
