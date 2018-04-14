package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {

	Cell cell;
	
	@Before
	public void setUp() {
		
		cell = new Cell();
	}
	@Test
	public void lebtDieZelle() {
		
		assertTrue(cell.isAlive());
	}

	@Test
	public void dieZelleLebtWennSieLebendigIst() {
		
		cell.setAlive(true);
		assertTrue(cell.isAlive());
	}
	
	@Test
	public void anzahl0LebendeNachbarnEinerZelle() {
		assertEquals(0,cell.getAnzahlLebenderNachbarn());
	}
	
	@Test
	public void anzahl2LebendeNachbarnEinerZelle() {
		cell.setAnzahlLebenderNachbarn(2);
		assertEquals(2,cell.getAnzahlLebenderNachbarn());
	}
	
	@Test
	public void ueberlebtDieZelleMit2Nachbarn() {
		cell.setAlive(true);
		cell.setAnzahlLebenderNachbarn(2);
		assertTrue(cell.ueberlebtDieZelle());
	}

	@Test
	public void ueberlebtDieZelleMit1Nachbar() {
		cell.setAlive(true);
		cell.setAnzahlLebenderNachbarn(1);
		assertFalse(cell.ueberlebtDieZelle());
	}
	
	@Test
	public void ueberlebtEneToteZelleMit3Nachbarn() {
		cell.setAlive(false);
		cell.setAnzahlLebenderNachbarn(3);
		assertTrue(cell.ueberlebtDieZelle());
	}
	
	
	@Test
	public void wirdDieZelleMit3NachbarnGeboren() {
		cell.setAlive(false);
		cell.setAnzahlLebenderNachbarn(3);
		cell.setAlive(cell.ueberlebtDieZelle());
		assertTrue(cell.isAlive);
	}
	
	@Test
	public void ueberlebtDieZelleMit4Nachbar() {
		cell.setAlive(true);
		cell.setAnzahlLebenderNachbarn(4);
		assertFalse(cell.ueberlebtDieZelle());
	}
}


	
	
