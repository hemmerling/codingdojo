using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberInWords
{
    public static class NumbersInWords
    {
        public static string Translate(int input)
        {
            string result = "";
            int[] splitted = input.ToString();
            int length = input.ToString().Length;

            if (length == 2)
            {
                switch (input)
                {
                    case 1: return "One";
                    case 2: return "Two";
                    case 3: return "Three";
                    case 4: return "Four";
                    case 5: return "Five";
                    case 6: return "Six";
                    case 7: return "Seven";
                    case 8: return "Eight";
                    case 9: return "Nine";
                }

            switch (input)
            {
                case 1: return "One";
                case 2: return "Two";
                case 3: return "Three";
                case 4: return "Four";
                case 5: return "Five";
                case 6: return "Six";
                case 7: return "Seven";
                case 8: return "Eight";
                case 9: return "Nine";
                case 10: return "Ten";
                case 11: return "Eleven";
                case 12: return "Twelve";
                case 13: return "Thirteen";
                default: throw new IndexOutOfRangeException();
            }
        }
    }
}
