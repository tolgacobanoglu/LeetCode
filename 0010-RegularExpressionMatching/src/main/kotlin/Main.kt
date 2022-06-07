fun main() {

    //Example 1:
    var s = "a"
    var p = "aa" //probably they give wrong values string and pattern it must be like this
    println(isMatch(s,p))

    //Example 2:
    s = "a"
    p = "a*" //it means zero or more "a"
    println(isMatch(s,p))

    //Example 3:
    s = "ab"
    p = ".*" //it means zero or more char contains
    println(isMatch(s,p))

}

fun isMatch(s: String, p: String): Boolean {
    var isMatch = false

    //used regular expression library to direct simply solution it can be possible using traditional way with for loop, but it is more efficient
    val pattern = Regex(p)

    isMatch = pattern.containsMatchIn(s)

    return isMatch
}