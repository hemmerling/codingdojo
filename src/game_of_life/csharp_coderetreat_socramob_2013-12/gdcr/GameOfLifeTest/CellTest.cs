using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GameOfLifeTest
{
    using GameOfLife;

    using NUnit.Framework;

    [TestFixture]
    public class CellTest
    {
        [Test]
        public void A_cell_should_be_alive_by_default()
        {
            var cell = new Cell();    
            Assert.AreEqual(new IsAlive(), cell.IsDeadOrAlive());
        }

        [Test]
        public void A_cell_is_dead_after_killing_them()
        {
            var cell = new Cell();
            cell.Kill();
            Assert.AreEqual(new IsDead(), cell.IsDeadOrAlive());
        }
    }
}
