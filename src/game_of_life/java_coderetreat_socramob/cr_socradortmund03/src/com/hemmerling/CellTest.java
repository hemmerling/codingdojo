package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {
	
	Cell cell;
	enum state { alive, dead };
	enum neighbours { oneOrLess, two, three, fourOrMore }

	@Before
	public void setup()
	{
		cell = new Cell();
	}

	@Test
	public void aCellTest()
	{
		cell.myState = Cell.state.alive;
		
		assertTrue("A cell is alive", 
					cell.myState==Cell.state.alive);
	}

	@Test
	public void LifeCellHas2NeighboursWillBeAlive()
	{
		cell.myState = Cell.state.alive;
		cell.myNeighbours = Cell.neighbours.two;
		assertEquals("A cell will be alive", 
				cell.nextState(), Cell.state.alive);
	}

	@Test
	public void DeadCellHas3NeighboursWillBeAlive()
	{
		cell.myState = Cell.state.dead;
		cell.myNeighbours = Cell.neighbours.three;
		assertEquals("A cell will be alive", 
				cell.nextState(), Cell.state.alive);
	}

}


	
	
