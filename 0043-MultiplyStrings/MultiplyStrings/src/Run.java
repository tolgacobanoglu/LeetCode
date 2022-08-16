import java.math.BigInteger;

public class Run
{
    public static void main(String[] args) {
        //Example 1:
        System.out.println(multiply("2","3"));

        //Example 2:
        System.out.println(multiply("123","456"));
    }

    public static String multiply(String num1, String num2)
    {
        BigInteger result = new BigInteger(num1);
        result = result.multiply(new BigInteger(num2));

        return result.toString();
    }
}
