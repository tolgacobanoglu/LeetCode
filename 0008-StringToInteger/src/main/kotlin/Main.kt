fun main(){
    //Example 1:
    println(myAtoi("42"))
    //Example 2:
    println(myAtoi("   -42"))
    //Example 3:
    println(myAtoi("4193 with words"))
}

fun myAtoi(text: String): Int {

    // check for negative case(if in case there might be anywhere of in string (-) character we could find index (-) and check index+1 isDigit or not)
    var isNegative = false
    if (text.contains("-"))
    {
        isNegative = true
    }

    var valueAsString = ""
    for (i in text.indices) //we know test cases a number is start and finish there is no manipulation data between to digits
    {
        if (text[i].isDigit())
        {
            valueAsString+=text[i]
        }
    }

    var value = valueAsString.toInt()
    if (isNegative) //if negative convert it to negative
    {
        value *= -1
    }


    return value
}
