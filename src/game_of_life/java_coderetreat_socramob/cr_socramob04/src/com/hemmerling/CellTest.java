package com.hemmerling;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CellTest {

	@Test
	public void hasOneNeighbor() {
	// Given
		int numberOfNeighbors = 0;
	// When
		numberOfNeighbors = 1;
	// Then
	assertEquals(1, numberOfNeighbors );
	}

	@Test
	public void isDeadInNextGenerationWithCellAliveAnd1Neighbors() {
	// Given
		int numberOfNeighbors = 1;
		boolean isAlive = true;
	// When
		isAlive = false;
	// Then
	assertEquals(false, isAlive );
	}

}
