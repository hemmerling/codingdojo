using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NumberInWords
{
  public class NumberInWords
  {
    static  void Main(string[] args)
    {
    }

    static public string TwoDigits(int dollar)
    {
      return "";
    }

    static public string Transform(int dollar)
    {
      string result = "";

      switch (dollar)
      {
        case 0:
          result = "";
          break;
        case 1:
          result = "one";
          break;
        case 2:
          result = "two";
          break;
        case 3:
          result = "three";
          break;
        case 4:
          result = "four";
          break;
        case 5:
          result = "five";
          break;
        case 6:
          result = "six";
          break;
        case 7:
          result = "seven";
          break;
        case 8:
          result = "eight";
          break;
        case 9:
          result = "nine";
          break;
        case 20:
          result = "twenty";
          break;
        case 30:
          result = "thirty";
          break;
        case 40:
          result = "fourty";
          break;
        case 50:
          result = "fivety";
          break;
        case 60:
          result = "sixty";
          break;
        case 70:
          result = "seventy";
          break;
        case 80:
          result = "eighty";
          break;
        case 90:
          result = "ninety";
          break;
        default:
          break;
      }
      return result;
    }

    static public string Calculate(int dollar)
    {
      //int hundred = dollar / 100;
      int tenth = dollar / 10;
      int one = dollar % 10;

      string result = Transform(tenth);
      result += Transform(one); 

      return result;
    }
  }
}
