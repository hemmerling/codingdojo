package de.gb.coderetreat;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

public class PatternMatcherTest
{
	@Test
	public void staysAliveWithTwoNeighbours() throws Exception
	{
		//GIVEN
		assertWithFlipping(true, "xx0|0x0|000");
		assertWithFlipping(true, "x0x|0x0|000");
		assertWithFlipping(true, "x00|xx0|000");
	}
	
	@Test
	public void diesWithFourNeighbours() throws Exception
	{
		assertWithFlipping(false, "xxx|0x0|0x0");
		assertWithFlipping(false, "xxx|0xx|000");
		assertWithFlipping(false, "xx0|xxx|000");
	}
	
	@Test
	public void isBornWithThreeNeighbours() throws Exception
	{
		assertWithFlipping(true, "xx0|000|0x0");
		assertWithFlipping(true, "xx0|00x|000");
		assertWithFlipping(true, "x00|x0x|000");
	}
	
	@Test
	public void isNotBornWithTwoNeighbours() throws Exception
	{
		assertWithFlipping(false, "x00|000|0x0");
		assertWithFlipping(false, "x00|00x|000");
		assertWithFlipping(false, "000|x0x|000");
	}

	
	private void assertWithFlipping(boolean expected, String pattern)
	{
		assertEquals(expected, PatternMatcher.isAliveInNextRound(pattern));
		assertEquals(expected, PatternMatcher.isAliveInNextRound(reverseString(pattern)));
	}
	
	private String reverseString(String string)
	{
		String reversed = "";
		for (Character iterable_element : string.toCharArray())
		{
			reversed = iterable_element + reversed;
		}
		return reversed;
	}
}
