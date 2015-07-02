/**
 *  @package   hemmerling.com.fizzbuzz
 *  @file      FizzBuzzTests.cs
 *  @brief     The test class for the C# application "FizzBuzz"
 *             , using NUnit
 *  @author    Rolf Hemmerling <hemmerling@gmx.net>
 *  @version   1.00
 *  @date      2015-06-01
 *  @copyright Apache License, Version 2.0
 *
 *  FizzBuzz - C# application "FizzBuzz"
 *  		   The test class, using NUnit
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
using System;
using NUnit.Framework;
using System.Diagnostics;

namespace FizzBuzz
{
    [TestFixture]
    public class FizzBuzzTest
    {
        [Test]
        public void TestFizzBuzz01()
        {
            // arrange
            FizzBuzz test = new FizzBuzz();
            // act
            string expected = "1";
            string actual = test.FizzBuzzResult(1);
            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void TestFizzBuzz03()
        {
            // arrange
            FizzBuzz test = new FizzBuzz();
            // act
            string expected = "Fizz";
            string actual = test.FizzBuzzResult(3);
            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void TestFizzBuzz05()
        {
            // arrange
            FizzBuzz test = new FizzBuzz();
            // act
            string expected = "Buzz";
            string actual = test.FizzBuzzResult(5);
            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void TestFizzBuzz06()
        {
            // arrange
            FizzBuzz test = new FizzBuzz();
            // act
            string expected = "Fizz";
            string actual = test.FizzBuzzResult(6);
            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void TestFizzBuzz10()
        {
            // arrange
            FizzBuzz test = new FizzBuzz();
            // act
            string expected = "Buzz";
            string actual = test.FizzBuzzResult(10);
            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void TestFizzBuzz15()
        {
            // arrange
            FizzBuzz test = new FizzBuzz();
            // act
            string expected = "FizzBuzz";
            string actual = test.FizzBuzzResult(15);
            // assert
            Assert.AreEqual(expected, actual);
        }

        [Test]
        public void TestFizzBuzz100()
        {
            // arrange
            FizzBuzz test = new FizzBuzz();
            // act
            string[] aListe = { 
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
            string[] expected = aListe;
            string[] actual = test.FizzBuzzResultListe();
            // assert
            CollectionAssert.AreEqual(expected, actual);
        }

    }
}
