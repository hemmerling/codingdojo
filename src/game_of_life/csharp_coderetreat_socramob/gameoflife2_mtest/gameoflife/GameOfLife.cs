using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace gameoflife
{
    public class GameOfLife
    {
        private int anzahlNachbarn;

        public GameOfLife(int anzahlNachbarn)
        {
            this.anzahlNachbarn = anzahlNachbarn;
        }

        public bool ZelleUeberlebt()
        {
            bool zelleUeberlebt = (this.anzahlNachbarn >= 2);
            return zelleUeberlebt;
        }

        static void Main(string[] args)
        {
        }
    }
}
