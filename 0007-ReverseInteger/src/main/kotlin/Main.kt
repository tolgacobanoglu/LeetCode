fun main()
{
    //Example 1:
    println(reverse(123))
    //Example 2:
    println(reverse(-123))
    //Example 3:
    println(reverse(120))
}

fun reverse(number: Int): Int
{
    var result = number

    while (result%10==0) {      // for **000 conditions
        result /= 10
    }

    var resultAsString : String

    if (result<0)               //for -** conditions
    {
        resultAsString = result.toString().substring(1)
        resultAsString = resultAsString.reversed()
        resultAsString = "-$resultAsString"
        result = resultAsString.toInt()
    }
    else                        //for ** conditions
    {
        resultAsString = result.toString()
        resultAsString = resultAsString.reversed()
        result = resultAsString.toInt()
    }

    return result
}