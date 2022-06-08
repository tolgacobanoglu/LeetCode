fun main()
{
    //Example 1:
    println(isPalindrome(121))

    //Example 2:
    println(isPalindrome(-121))
    
    //Example 3:
    println(isPalindrome(10))
}

fun isPalindrome(number: Int): Boolean
{
    var isPalindrome = false

    val numberAsString = number.toString()
    val reverseNumberAsString = numberAsString.reversed()

    if (reverseNumberAsString == numberAsString)
    {
        isPalindrome = true
    }

    return isPalindrome
}