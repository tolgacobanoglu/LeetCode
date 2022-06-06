fun main(){
    //Example 1:
    var result = lengthOfLongestSubstring("abcabcbb")
    println(result)

    //Example 2:
    result = lengthOfLongestSubstring("bbbbb")
    println(result)

    //Example 3:
    result = lengthOfLongestSubstring("pwwkew")
    println(result)
}

fun lengthOfLongestSubstring(word: String): Int {

    var letterSet = HashSet<String>() //to check if repeatating or not
    var tempCounter = 0 //counter for current
    var counter = 0 //counter for general
    var longestSubWord = "" //check for substring of word or not
    for (i in 0 until word.length)
    {
        if (letterSet.contains(word[i].toString())) //check is letter count it before or not
        {
            //if exist and clear temp counter and if greater than counter inject its value
            if (tempCounter>counter)
            {
                counter=tempCounter
            }
            tempCounter=0
        }
        else // didn't take before the letter
        {
            if (word.contains(longestSubWord)) //check for substring or not
            {
                longestSubWord += word[i].toString()
                counter++
                tempCounter++
                letterSet.add(word[i].toString())
            }
            else // if not just add to set letter
            {
                letterSet.add(word[i].toString())
            }

        }
    }

    return counter
}