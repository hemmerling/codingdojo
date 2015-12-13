using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using gameoflife;

namespace gameoflife_test
{
    [TestClass]
    public class GameOfLifeTest
    {

        // References -> Add Project "gameoflife"

        [TestMethod]
        public void ZelleMit0NachbarnStirbt()
        {
            int AnzahlNachbarn = 0;
            GameOfLife myGameOfLife = new GameOfLife(AnzahlNachbarn);
            Assert.AreEqual(false, myGameOfLife.ZelleUeberlebt());
        }

        [TestMethod]
        public void ZelleMit1NachbarnStirbt()
        {
            int AnzahlNachbarn = 1;
            GameOfLife myGameOfLife = new GameOfLife(AnzahlNachbarn);
            Assert.AreEqual(false, myGameOfLife.ZelleUeberlebt());
        }

        [TestMethod]
        public void ZelleMitZweiNachbarnUeberlebt()
        {
            int AnzahlNachbarn = 2;
            GameOfLife myGameOfLife = new GameOfLife(AnzahlNachbarn);
            Assert.AreEqual(true, myGameOfLife.ZelleUeberlebt());
        }

        static void Main(string[] args)
        {
        }

    }
}
