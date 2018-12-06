using NUnit.Framework;
using ClassLibrary1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary1.TestsNUnit
{
    [TestFixture()]
    public class Class1TestsNUnit
    {

        [TestCase(5, "five")]
        [TestCase(50, "fifty")]
        [TestCase(55, "fifty five")]
        [TestCase(555, "five hundred and fifty five")]
        [TestCase(505, "five hundred and five")]
        [TestCase(500, "five hundred")]
        [TestCase(14, "fourteen")]
        [TestCase(16, "sixteen")]
        [TestCase(17, "seventeen")]
        public void Test_5Dollars(int dollar, string expected)
        {
            //int dollar = 5;
            //string expected = "five";
            string result = NumberInWords.Calculate(dollar);
            Assert.AreEqual(expected, result,$"We want {expected} Dollars");

        }
    }
}