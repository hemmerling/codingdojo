package gol5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGol {

	@Test
	public void zelleMit3NachbarnLebt() {
		//fail("Not yet implemented");
		int numberOfNeighbours = 3;
 		GameOfLife myGameOfLife = new GameOfLife(numberOfNeighbours);
		assertTrue(myGameOfLife.myCellLivesInNextGeneration());
	}

	@Test
	public void zelleMit1NachbarnStirbt() {
		//fail("Not yet implemented");
		int numberOfNeighbours = 1;
 		GameOfLife myGameOfLife = new GameOfLife(numberOfNeighbours);
		assertTrue(!myGameOfLife.myCellLivesInNextGeneration());
	}

	@Test
	public void zelleMit1NachbarnStirbtParameter() {
		//fail("Not yet implemented");
		int numberOfNeighbours = 1;
 		GameOfLife myGameOfLife = new GameOfLife();
		assertTrue(
		  !myGameOfLife.myCellLivesInNextGenerationParameter(myGameOfLife.numberOfNeighboursFunction(1)));
	}

}
