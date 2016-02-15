using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace GameOfLife.Tests
{
    public class AliveTestListener : IAliveListener
    {
        public AliveTestListener()
        {

        }

        public void ConfirmAlive()
        {
           
        }

        public void ConfirmDead()
        {
            Assert.Fail();
        }
    }

    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void IsCellAlive()
        {
            // Arrange
            Cell cell = new Cell();

            AliveTestListener aliveTestListener = new AliveTestListener();

            cell.ConfirmAliveByListener(aliveTestListener);

            // Verboten:
            // Assert.IsFalse(cell.IsAlive);
        }
    }
}