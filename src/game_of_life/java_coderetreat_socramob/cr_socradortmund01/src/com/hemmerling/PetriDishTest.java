package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetriDishTest {
	
	PetriDish petriDish;

	@Test
	public void petriDishHasCells()
	{
		petriDish = new PetriDish();
		
		boolean hasCells = petriDish.hasCells();
		assertTrue("A petridish has cells", hasCells);
	}
	
	@Test
	public void petriDishHas0Cell()
	{
		petriDish = new PetriDish();
		
		int numberOfCells = petriDish.numberOfCells();
		assertTrue("A petridish has cells", numberOfCells==0);
	}

}
