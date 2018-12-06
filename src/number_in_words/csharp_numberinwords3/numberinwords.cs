using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary1
{  
    public class NumberInWords
    {
        public static string NeedSpace(int dollar)
        {
            int tenth = dollar / 10;
            int one = dollar % 10;
            string result = "";
            if ((tenth > 0) && (one > 0))
            {
                result = " ";
            }
            return result;
        }
        public static string NeedAnd(int dollar)
        {
            int hundreds = dollar / 100;
            int tenth = (dollar % 100) / 10;
            int one = dollar % 10;
            string result = "";
            if ((hundreds > 0) && (tenth > 0))
            {
                result = " and ";
            }
            else if ((hundreds > 0) && (one > 0))
            {
                result = " and";
            }
            return result;
        }
        public static string Translate(int dollar)
        {
            switch (dollar)
            {
                case 5: return "five";
                case 50: return "fifty";
                case 500: return "five hundred";
                case 4: return "four";
                case 6: return "six";
                case 7: return "seven";
                case 10: return "teen";
                default: return "";
            }
        }

        public static string Calculate(int dollar)
        {
            int hundreds = dollar / 100;
            int tenth = (dollar % 100) / 10;
            int one = dollar % 10;
            string result;
            result = Translate(hundreds*100)+NeedAnd(dollar)+Translate(tenth*10) + NeedSpace(dollar) + Translate(one);
            return result;
        }

    }
}
