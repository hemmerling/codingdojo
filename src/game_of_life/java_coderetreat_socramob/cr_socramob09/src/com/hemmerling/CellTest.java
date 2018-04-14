package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void aCellTest()
	{
		//GIVEN
		Cell cell = new Cell(0);
		
		//WHEN
		boolean alive = cell.isAlive();
		
		//THEN
		assertFalse("A cell with no neighbors has to be dead", alive);
	}

	@Test
	public void aTooMuchNeighboursTest()
	{
		//GIVEN
		Cell cell = new Cell(4);
		
		//WHEN
		boolean alive = cell.isAlive();
		
		//THEN
		assertFalse("A cell with 4 neighbors has to be dead", alive);
	}
	
	@Test
	public void aJustEnoughNeighboursTest()
	{
		//GIVEN
		Cell cell = new Cell(false,3);
		
		//WHEN
		boolean alive = cell.isAlive();
		
		//THEN
		assertTrue("A dead or alive cell with 3 neighbors will always be alive", alive);
	}

	@Test
	public void aNotEnoughNeighboursForRevivalTest()
	{
		//GIVEN
		Cell cell = new Cell(false,2);
		
		//WHEN
		boolean alive = cell.isAlive();
		
		//THEN
		assertFalse("A dead cell with 2 neighbors won't be revived", alive);
	}
	
	@Test
	public void aSpielfeldErstellungsTest()
	{
		//GIVEN
		boolean feld1[] = {false, false, false,
				   false, true, false,
				   false, false, false };
		Spielfeld spielfeld = new Spielfeld(feld1);
		
		//WHEN
		int numberOfCells = spielfeld.numberOfCells();
		
		//wie hast du dir das spielfeld vorgestellt
		//array von 9 elelmenten
		//das spielfeld soll keine begrenzung haben, es müssen auch 
		//grössere Spielfelder
		//möglich sein
		//nein muss nicht, ist unsere / Deine Entscheidung :-)
		
		//THEN
		assertEquals("The demo field1 has one alive element", numberOfCells,1);
	}

}

	
