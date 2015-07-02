package de.gb.coderetreat;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class CellTest
{
	@Test
	public void aNewCellShouldHaveNoNeighbors() throws Exception
	{
		//GIVEN
		AtomicInteger numberOfNeighbors = new AtomicInteger(-1);
		
		//WHEN
		Cell cell = new Cell();
		cell.writeNumberOfNeighborsTo(numberOfNeighbors);

		//THEN
		assertThat(numberOfNeighbors.get(), equalTo(0));
	}
	
	@Test
	public void aNewCellDiesWithOneNeighbour() throws Exception
	{
		//GIVEN
		AtomicInteger numberOfNeighbors = new AtomicInteger(-1);
		
		//WHEN
		Cell cell = new Cell(new Cell());
		cell.writeNumberOfNeighborsTo(numberOfNeighbors);

		//THEN
		assertThat(numberOfNeighbors.get(), equalTo(1));
	}
	
	@Test
	public void aNewCellDiesIfItHasOnlyOneNeighbor() throws Exception
	{
		//GIVEN
		Cell neighbor = new Cell();
		CellListener listener;
		
		//WHEN
		Cell cell = new Cell(neighbor);
		cell.tellNumberOfNeighborsTo(listener);

		//THEN
		
	}
}
