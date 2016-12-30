/**
 * Created by Andrew on 12/29/2016.
 */
class AndrewMath
{
    public int add(int var1, int var2)
    {
        var1 + var2
    }

    public int div(int var1, int var2)
    {
        if (var2 == 0)
        {
                throw new ArithmeticException("Divide by zero")
        }
        var1 / var2
    }
}
