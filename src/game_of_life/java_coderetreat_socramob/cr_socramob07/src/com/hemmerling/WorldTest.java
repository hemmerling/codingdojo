package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorldTest {

	@Test
	public void worldIsDeadByDefault()
	{
		//GIVEN
		World world = new World();
		//WHEN
		
		//THEN
		assertFalse(world.isSomebodyAlive());
	}
	
	@Test
	public void cellAtGivenPositionShouldBeAlive()
	{
		World world = new World();
		//world.setCellAlive(1,1);
		//assertTrue(world.isCellAlive(1,1));
		assertTrue(world.setCellState(true,1,1));
	}
	@Test
	public void livingCellshouldBeKilled()
	{
		World world = new World();
		world.setCellState(true,1,1);
		//assertTrue(world.isCellAlive(1,1));
		//world.setCellDead(1,1);
		//assertFalse(world.isCellAlive(1,1));
		assertFalse(world.setCellState(false,1,1));
	}
	
	
}
