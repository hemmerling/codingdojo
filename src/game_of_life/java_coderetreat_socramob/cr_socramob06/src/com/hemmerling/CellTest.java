package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void aCellWithTwoNeighborsIsAlive()
	{
		//GIVEN
		Cell cell = new Cell(2);
		
		//WHEN
		boolean alive = cell.isAlive();
		
		//THEN
		assertTrue("A cell with two neighbors has to live", alive);
	}

	@Test
	public void aCellWithOneNeighborIsLonelyAndDies()
	{
		//GIVEN
		Cell cell = new Cell(1);
		
		//WHEN
		boolean alive = cell.isAlive();
		
		//THEN
		assertFalse("A cell with only one neighbor should be dead", alive);
	}
	
	@Test
	public void aCellWithNoNeighborsDies() 
	{
		//GIVEN
		Cell cell = new Cell(0);
		
		//WHEN
		boolean alive = cell.isAlive();
		
		//THEN
		assertFalse("A cell with no neighbors should be dead", alive);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void aCellWithWrongConstructor() 
	{
		//GIVEN
		int numberOfNeighbours = -1;
		
		//WHEN
		new Cell(numberOfNeighbours);
		
		//THEN
		//an exception should be thrown
	}	
	
}
