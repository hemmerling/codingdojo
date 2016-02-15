namespace GameOfLife
{
    public class Cell
    {
        private bool isAlive = false;

        public Cell()
        {
        }

        public void ConfirmAliveByListener(IAliveListener aliveTestListener)
        {
            if (isAlive)
            {
                aliveTestListener.ConfirmAlive();
            }
        }

        public void ConfirmDeadByListener(IAliveListener aliveTestListener)
        {
            if (!isAlive)
            {
                aliveTestListener.ConfirmDead();
            }
        }
    }

    public interface IAliveListener
    {
        void ConfirmAlive();
        void ConfirmDead();
    }
}