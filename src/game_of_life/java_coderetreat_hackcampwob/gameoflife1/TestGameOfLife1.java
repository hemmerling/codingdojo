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

}
