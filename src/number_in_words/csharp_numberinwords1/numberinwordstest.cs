using System;
using NUnit.Framework;


namespace NumberInWords
{
  [TestFixture]
  public class NUnitTest1
  {
    [TestCase(1, "one")]
    [TestCase(2, "two")]
    [TestCase(3, "three")]
    [TestCase(4, "four")]
    [TestCase(5, "five")]
    [TestCase(6, "six")]
    [TestCase(7, "seven")]
    [TestCase(8, "eight")]
    [TestCase(9, "nine")]
    public void NumberInWords_OneDollar(int dollar, string expected)
    {
      //arrange
      //int dollar = 5;
      string result = "";

      // act
      result = NumberInWords.Calculate(dollar);

      // assert
      Assert.AreEqual(expected, result, $"{expected} dollars expected");
    }

    [TestCase(20, "twenty")]
    [TestCase(21, "twenty one")]
    [TestCase(30, "thirty")]
    [TestCase(40, "fourty")]
    [TestCase(50, "fivety")]
    [TestCase(60, "sixty")]
    [TestCase(70, "seventy")]
    [TestCase(80, "eighty")]
    [TestCase(90, "ninety")]
    public void NumberInWords_TenDollar(int dollar, string expected)
    {
      //arrange
      string result = "";

      // act
      result = NumberInWords.Calculate(dollar);

      // assert
      Assert.AreEqual(expected, result, $"{expected} dollars expected");
    }
  }
}