//05.06.2022

fun main()
{
    //Example 1:
    var numbers = intArrayOf(2,7,11,15)
    var target = 9

    println(twoSum(numbers,target).contentToString())

    //Example 2:
    numbers = intArrayOf(3,2,4)
    target = 6

    println(twoSum(numbers,target).contentToString())


    //Example 3:
    numbers = intArrayOf(3,3)
    target = 6

    println(twoSum(numbers,target).contentToString())

}


fun twoSum(numbers: IntArray, target: Int): IntArray {

    for (i in 0..numbers.size-1)
    {
        for (j in 1..numbers.size-1)
        {
            if(i==j)
            {
                continue;
            }
            
            if (numbers[i] + numbers[j] == target)
            {
                return intArrayOf(i , j)
            }
        }
    }

    return intArrayOf(-1,-1) // for error condition
}
