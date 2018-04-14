package com.hemmerling;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberConverterTest {

	private RomanNumberConverter converter = new RomanNumberConverter();

	@Test
	public void romanOneTest() {
		assertRomanNumber(1, "I");
	}

	@Test
	public void romanThreeTest() {
		assertRomanNumber(3, "III");
	}

	@Test
	public void romanFourTest() {
		assertRomanNumber(4, "IV");
	}

	@Test
	public void romanFiveTest() {
		assertRomanNumber(5, "V");
	}

	@Test
	public void romanSixTest() {
		assertRomanNumber(6, "VI");
	}

	@Test
	public void romanTenTest() {
		assertRomanNumber(10, "X");
	}

	@Test
	public void romanNineTest() {
		assertRomanNumber(9, "IX");
	}

	@Test
	public void romanTenToNineteenTest() {
		assertRomanNumber(15, "XV");
	}
	
	@Test
	public void roman49resultsInXLIX() {
		assertRomanNumber(49, "XLIX");
	}
	
	@Test
	public void roman555resultsInDLV() {
		assertRomanNumber(555, "DLV");
	}

	@Test
	public void roman2014resultsInMMXIV() {
		assertRomanNumber(2014, "MMXIV");
	}
	
	@Test
	public void roman999resultsInCMXCIX() {
		assertRomanNumber(999, "CMXCIX");
	}
	
	@Test
	public void roman100resultsInC() {
		assertRomanNumber(100, "C");
	}
	
	@Test
	public void roman400resultsInCD() {
		assertRomanNumber(400, "CD");
	}

	private void assertRomanNumber(final int arabic,
			final String expectedRoman) {
		assertEquals(expectedRoman, converter.convertArabicToRoman(arabic));
	}
}
