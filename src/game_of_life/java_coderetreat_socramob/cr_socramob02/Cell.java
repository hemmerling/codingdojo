package de.gb.coderetreat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Cell
{
	private List<Cell> neighbours;
	
	public Cell()
	{
		this.neighbours = Collections.emptyList();
	}

	public Cell(Cell cell)
	{
		this.neighbours = Arrays.asList(cell);
	}

	public void writeNumberOfNeighborsTo(AtomicInteger numberOfNeighbors)
	{
		numberOfNeighbors.set(neighbours.size());
	}

	public void tellNumberOfNeighborsTo(CellListener listener)
	{
		// TODO Auto-generated method stub
		
	}
}
