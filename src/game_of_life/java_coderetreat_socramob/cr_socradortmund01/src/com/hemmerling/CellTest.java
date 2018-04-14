package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {
	Cell cell;
	Cell deadCell;
	Cell aliveCell;
	
	@Before
	public void setUp(){
		cell = new Cell(true);
		
	}

	@Test
	public void isCellAlive()
	{
		boolean alive = cell.isAlive();
		assertTrue("A cell lives", alive);
	}

	
	@Test
	public void isDeadCellDead()
	{
		deadCell = Cell.deadCell();
		boolean alive = deadCell.isAlive();
		assertFalse("A cell doesn't live", alive);
	}

	@Test
	public void isAliveCellAlive()
	{
		aliveCell = Cell.aliveCell();
		boolean alive = aliveCell.isAlive();
		assertTrue("A cell lives", alive);
	}
}


	
	
