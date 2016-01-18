using System;

namespace hackcamp2016s1
{
    internal class GameOfLife
    {
        private int Number = 0;
        private bool isAlive = true;

        public GameOfLife()
        {
        }

        internal void setNumberOfNeighbour(int v)
        {
            Number = v;
            isAlive = v == 4;
        }

        internal bool survives()
        {
            return Number==2;
        }

        internal void setAlive(bool v)
        {
            isAlive = v;
        }
    }
}