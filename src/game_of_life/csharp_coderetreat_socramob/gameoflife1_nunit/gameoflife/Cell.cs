using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GameOfLife
{
    public class Cell
    {
        private Object _status;

        public Cell()
        {
            _status = new IsAlive();
        }

        public Object IsDeadOrAlive()
        {
            return _status;
        }

        public void Kill()
        {
            _status = new IsDead();
        }
    }
}
