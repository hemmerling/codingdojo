package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void aCellAliveTest()
	{
		//GIVEN
		Cell cell = new Cell();
		
		//WHEN
		boolean status = cell.isAlive();
		
		//THEN
		assertFalse("A new cell is dead",status);
	}

	@Test
	public void aCellNextStepTest()
	{
		//GIVEN
		Cell cell = new Cell();
		
		//WHEN
		boolean status = cell.nextStep();
		
		//THEN
		assertFalse("With next step, the cell is dead",status);
	}

	@Test
	public void aCellLivesWith3NeighboursTest()
	{
		//GIVEN
		int numberOfNeighbours = 3;
		Cell cell = new Cell(true, numberOfNeighbours);
		
		//WHEN
		cell.nextStep();
		boolean status = cell.isAlive();
		
		//THEN
		assertTrue("A cell with 3 neighbours lives or is reanimated",status);
	}
	
	public void aDeadCellWith2NeighboursStaysDeadTest()
	{
		//GIVEN
		int numberOfNeighbours = 2;
		Cell cell = new Cell(false, numberOfNeighbours);
		
		//WHEN
		cell.nextStep();
		boolean status = cell.isAlive();
		
		//THEN
		assertFalse("A cell with 2 neighbours stays dead",status);
	}

}

	
	
