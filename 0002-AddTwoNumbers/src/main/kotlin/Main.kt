import java.util.*

fun main() {
    //Example 1:
    var firstList = LinkedList<Int>(listOf(2,4,3))
    var secondList = LinkedList<Int>(listOf(5,6,4))
    var result = addTwoNumbers(firstList,secondList)
    println(result)


    //Example 2:
    firstList = LinkedList<Int>(listOf(0))
    secondList = LinkedList<Int>(listOf(0))
    result = addTwoNumbers(firstList,secondList)
    println(result)

    //Example 3:
    firstList = LinkedList<Int>(listOf(9,9,9,9,9,9,9))
    secondList = LinkedList<Int>(listOf(9,9,9,9))
    result = addTwoNumbers(firstList,secondList)
    println(result)

}

fun addTwoNumbers(firstList:LinkedList<Int>,secondList:LinkedList<Int>): LinkedList<Int>
{
    //convert first list to string
    var firstNumberAsString = ""
    for (i in 0 until firstList.size)
    {
        firstNumberAsString += firstList[i].toString()
    }
    firstNumberAsString = firstNumberAsString.reversed()

    //convert second list to string
    var secondNumberAsString = ""
    for (i in 0 until secondList.size)
    {
        secondNumberAsString += secondList[i]
    }
    secondNumberAsString = secondNumberAsString.reversed()

    //convert them string to int for calculating result number
    val firstNumber = firstNumberAsString.toInt()
    val secondNumber = secondNumberAsString.toInt()

    val resultNumber = firstNumber+secondNumber
    val resultNumberAsString = resultNumber.toString()

    //push the digit as string a list
    var resultListAsString = LinkedList<String>()
    for (i in 0 until resultNumberAsString.length)
    {
        resultListAsString.add(0, resultNumberAsString[i].toString())
    }

    //convert string list to int list
    var resultList = LinkedList<Int>()
    for (i in 0 until resultNumberAsString.length)
    {
        resultList.add(resultListAsString[i].toInt())
    }

    return resultList
}


