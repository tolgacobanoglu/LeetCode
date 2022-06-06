fun main() {

    //Example 1:
    var firstNumbers = intArrayOf(1,3)
    var secondNumbers = intArrayOf(2)

    println(firstNumbers.contentToString())
    println(secondNumbers.contentToString())

    println(findMedianSortedArrays(firstNumbers,secondNumbers))

    //Example 2:
    firstNumbers = intArrayOf(1,2)
    secondNumbers = intArrayOf(3,4)

    println(firstNumbers.contentToString())
    println(secondNumbers.contentToString())

    println(findMedianSortedArrays(firstNumbers,secondNumbers))


}

/**
 * Used Arrays.sort method it has O(nlogn) probably we should use more benefit sort methods to decrease complexity of sort after the merge operation
 */
fun findMedianSortedArrays(firstNumbers: IntArray, secondNumbers: IntArray): Double {

    val merged = firstNumbers + secondNumbers
    merged.sort()
    println("Merged array : " + merged.contentToString())
    var median = 0.0
    var medianIndex = 0
    if (merged.size % 2 == 0) // if their element amount is even or odd
    {
        medianIndex = merged.size/2
        median = (merged[medianIndex].toDouble() + merged[medianIndex-1].toDouble()) / 2
    }
    else
    {
        medianIndex = merged.size/2
        median = merged[medianIndex].toDouble()
    }

    return median
}