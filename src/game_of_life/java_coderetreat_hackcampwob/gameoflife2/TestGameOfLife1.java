package hackcamp2016s2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestGameOfLife1 {

	@SuppressWarnings("deprecation")
	@Test
	public void livingCellHasNullNeighboursAndDies() {
		
		int ausdehnungX = 3;
		Board x = new Board(ausdehnungX);
		Board expectedX = new Board(ausdehnungX);
		x.setAlive(1,1);
		Board newX = x.evolve();
		Assert.assertEquals(expectedX.getArray(),newX.getArray() );
	}

	@SuppressWarnings("deprecation")
	@Test
	public void livingCellHas4NeighboursAndDies() {
		
		int ausdehnungX = 3;
		Board x = new Board(ausdehnungX);
		x.setAlive(1,1);
		x.setAlive(0,0);
		x.setAlive(0,1);
		x.setAlive(0,2);
		x.setAlive(1,0);
		Board expectedX = new Board(ausdehnungX);
		expectedX.setAlive(0,0);
		expectedX.setAlive(0,1);
		expectedX.setAlive(1,0);
		Board newX = x.evolve();
		Assert.assertEquals(expectedX.getArray(),newX.getArray() );
	}

}
