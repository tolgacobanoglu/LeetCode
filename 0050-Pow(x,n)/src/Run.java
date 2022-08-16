public class Run
{
    public static void main(String[] args)
    {
        //Example 1:
        System.out.println(myPow(2.00000,10));
        //Example 2:
        System.out.println(myPow(2.10000,3));
        //Example 3:
        System.out.println(myPow(2.00000,-2));


    }

    public static double myPow(double x, int n)
    {
        double result = 1;

        if (n == 0) //zero case for n
        {
            return result;
        }

        if (n>0) //normal case
        {
            for (int i = 0; i < n; i++)
            {
                result *= x;
            }
            return result;
        }

        if (n<0) // negative case
        {
            for (int i = 0; i < (-1*n); i++)
            {
                result /= x;
            }
            return result;
        }

        return result;
    }
}
