using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberInWords.Test
{
    [TestFixture()]
    public class NumbersInWordsTestClass
    {
        [Test()]
        public void Translate_Enter1_ReturnOne_Succesfully()
        {
            int input = 1;
            string expected = "One";

            test(input, expected);
        }

        [TestCase(1, "One")]
        [TestCase(2, "Two")]
        [TestCase(3, "Three")]
        [TestCase(4, "Four")]
        [TestCase(5, "Five")]
        public void Translate_EnterInput_ReturnExpectedValue_Succesfully(int input, string expected)
        {
            test(input, expected);
        }

        [TestCase(21, "Twenty One")]
        [TestCase(22, "Twenty Two")]
        [TestCase(23, "Twenty Three")]
        [TestCase(24, "Twenty Four")]
        [TestCase(25, "Twenty Five")]
        public void Translate_EnterTwoDigitInput_ReturnExpectedValue_Succesfully(int input, string expected)
        {
            test(input, expected);
        }

        private void test(int input, string expected)
        {
            string output = NumbersInWords.Translate(input);

            Assert.AreEqual(expected, output, $"{expected} expected.");
        }
    }
}
