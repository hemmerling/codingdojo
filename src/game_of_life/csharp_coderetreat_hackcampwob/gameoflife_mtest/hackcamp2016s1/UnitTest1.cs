using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace hackcamp2016s1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void LivingCellHasOneNeighbourAndDies()
        {
            var x = new GameOfLife();
            x.setNumberOfNeighbour(1);
            Boolean isAlive = x.survives();
            Assert.IsFalse(isAlive);

        }

        [TestMethod]
        public void LivingCellHasTwoNeighbourAndLife()
        {
            var x = new GameOfLife();
            x.setNumberOfNeighbour(2);
            Boolean isAlive = x.survives();
            Assert.IsTrue(isAlive);

        }

        [TestMethod]
        public void LivingCellHasFourNeighbourAndDies()
        {
            var x = new GameOfLife();
            x.setNumberOfNeighbour(4);
            Boolean isAlive = x.survives();
            Assert.IsFalse(isAlive);

        }

        [TestMethod]
        public void DeadCellHasThreeNeighbourAndLives()
        {
            var x = new GameOfLife();
            x.setAlive(false);
            x.setNumberOfNeighbour(3);
            Boolean isAlive = x.survives();
            Assert.IsTrue(isAlive);

        }

    }
}
