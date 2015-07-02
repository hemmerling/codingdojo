/**
 *  @package   hemmerling.com.fizzbuzz
 *  @file      FizzBuzzTests.java
 *  @brief     The test class for the Java application "FizzBuzz"
 *  @author    Rolf Hemmerling <hemmerling@gmx.net>
 *  @version   1.00
 *  @date      2015-06-01
 *  @copyright Apache License, Version 2.0
 *
 *  FizzBuzz - Java application "FizzBuzz"
 *  		   The test class, using JUnit 4.11
 *
 *  Copyright 2015 Rolf Hemmerling
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package hemmerling.com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz test;
    
	@Before
	public void setUpFizzBuzz() throws Exception {
		this.test = new FizzBuzz();
	}
	
	@Test
	public void testFizzBuzz01() {
		//fail("Not yet implemented");
        String expected = "1";
        String actual = this.test.fizzBuzz(1);
		assertEquals(expected, actual);
	}

	@Test
	public void testFizzBuzz03() {
        String expected = "Fizz";
        String actual = this.test.fizzBuzz(3);
		assertEquals(expected, actual);
	}

	@Test
	public void testFizzBuzz05() {
        String expected = "Buzz";
        String actual = this.test.fizzBuzz(5);
		assertEquals(expected, actual);
	}

	@Test
	public void testFizzBuzz06() {
        String expected = "Fizz";
        String actual = this.test.fizzBuzz(6);
		assertEquals(expected, actual);
	}

	@Test
	public void testFizzBuzz10() {
        String expected = "Buzz";
        String actual = this.test.fizzBuzz(10);
		assertEquals(expected, actual);
	}

	@Test
	public void testFizzBuzz15() {
        String expected = "FizzBuzz";
        String actual = this.test.fizzBuzz(15);
		assertEquals(expected, actual);
	}

	@Test
	public void testFizzBuzz07() {
		String aListe[] = { 
	    		"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
	    		"11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
	    		"Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
	    		"31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
	    		"41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
	    		"Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
	    		"61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
	    		"71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
	    		"Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
	    		"91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz" };
        String expected[] = aListe;
        String actual[] = this.test.fizzBuzzListe();
        assertArrayEquals(expected, actual);
	}
}