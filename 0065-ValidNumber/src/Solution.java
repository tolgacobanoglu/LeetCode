import java.util.regex.*;  

public class Solution 
{
    //for this solution prefered use regex library and dont use traditional for loops to check every digit with if/switch cases, used regex patterns and or statements "|"
    public boolean isNumber(String s) 
    {
        return Pattern.matches("[-+]{0,1}\\d+|[-+]{0,1}\\d+\\.\\d*|[-+]{0,1}\\d*\\.\\d+|[-+]{0,1}\\d+[e|.|E]{0,1}\\d+|\\d*\\.\\d+[e|E]{0,1}\\d+|[-+]{0,1}\\d+[.]{1}[e|E]{1}\\d+|[-+]{0,1}\\d*\\.\\d+[e|E]{1}\\d+|\\d+\\.\\d*[e|E]{1}[+|-]{1}\\d+|[-+]{0,1}\\d+[e|E]{1}[+|-]{1}\\d+|[-|+]{0,1}\\.\\d++[e|E]{1}[+|-]{0,1}\\d+",s);
    }
    //regex patterns need refactoring there might be repetation but it passed from leetcode test cases
}