namespace GameOfLife
{
    public abstract class Rip<T>
    {
        public override bool Equals(object obj)
        {
            return obj.GetType() == typeof(T);
        }

        public override int GetHashCode()
        {
            return base.GetHashCode();
        }
    }
}
