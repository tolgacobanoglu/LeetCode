import java.util.HashMap;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        //Example 1:
        System.out.println(longestPalindrome("babad"));

        //Example 2:
        System.out.println(longestPalindrome("cbbd"));

    }
    
    public static String longestPalindrome(String word)
    {
        SubstringFactory factory = new SubstringFactory();
        HashSet<String> substrings = factory.produceSubstring(word);

        HashMap<Integer,String> palindromes = new HashMap<>(); //key "length of palindrome" value "palindrome word"
        int maxLength = -1;//just a random number, and I will use it for direct access take it O(1) complexity, we can use for loop to find longest but, it will gain us to time

        for(String element : substrings) //search in a set
        {
            if (Palindrome.checker(element)) // palindrome condition
            {
                palindromes.put(element.length(),element);  //put into map
                if(maxLength<element.length())  //update maxLength value
                {
                    maxLength = element.length();
                }
            }
        }

        if (palindromes.containsKey(maxLength)) // check exist the key, map can be null
        {
            return palindromes.get(maxLength);
        }

        return "Not exist palindrome";
    }
}
