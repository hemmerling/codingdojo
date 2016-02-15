package com.hemmerling;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void keineLebendeZelleUndKeineNachbarn() {
		World world = new World();
		World newWorld = world.nextGeneration();

		assertEquals(CellState.DEAD, newWorld.cellState());
	}

	@Test
	public void keineLebendeZelleUnd1Nachbar() {
		World world = new World();
		MyCell cell = new MyCell();
		world.addNeighbor(cell);

		World newWorld = world.nextGeneration();

		assertEquals(CellState.DEAD, newWorld.cellState());
	}


	@Test
	public void keineLebendeZelleUnd3Nachbarn() {
		World world = new World();
		MyCell cell = new MyCell();
		world.addNeighbor(cell);
		world.addNeighbor(cell);
		world.addNeighbor(cell);
		World newWorld = world.nextGeneration();

		assertEquals(CellState.ALIVE, newWorld.cellState());
	}

	@Test
	public void vierNachbarn() {
		World world = new World();
		MyCell cell = new MyCell();
		world.addNeighbor(cell);
		world.addNeighbor(cell);
		world.addNeighbor(cell);
		world.addNeighbor(cell);
		World newWorld = world.nextGeneration();

		assertEquals(CellState.DEAD, newWorld.cellState());
	}

	@Test
	public void lebendeZelleUnd2Nachbarn() {
		World world = new World();
		MyCell cell = new MyCell();
		world.add(cell);
		world.addNeighbor(cell);
		world.addNeighbor(cell);

		World newWorld = world.nextGeneration();

		assertEquals(CellState.ALIVE, newWorld.cellState());
	}
}
