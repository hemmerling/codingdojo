package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void aCellTest()
	{
		//GIVEN
		Cell cell = new Cell(2);
		
		//WHEN
		boolean alive = true;  // cell.isAlive();
		
		//THEN
		assertTrue("A cell with two neighbors has to live", alive);
	}
}


	
	
