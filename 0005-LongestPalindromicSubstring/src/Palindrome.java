public class Palindrome
{
    private Palindrome() //for util method
    {
    }
    /**
     * @brief this method is checker for palindrome,using StringBuilder for taking reverse, but we can use StringBuffer instead of StringBuilder class
     * @param word is input
     * @return boolean value of isPalindrome true or not
     */
    public static boolean checker(String word)
    {
        StringBuilder builder = new StringBuilder(); //String is immutable therefore we need to use StringBuilder class
        String reversed = word;

        builder.append(reversed);
        builder.reverse();
        reversed = builder.toString();

        boolean isPalindrome = false;
        if (word.equals(reversed))
        {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
