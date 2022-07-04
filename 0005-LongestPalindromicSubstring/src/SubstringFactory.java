import java.util.HashSet;

public class SubstringFactory
{
    /**
     * @param word is a given string
     * @return  a substrings set, if we hold substring in a list or etc we have reputation data therefore if we have set there is no reputation on memory and decrease runtime
     */
    public HashSet<String> produceSubstring(String word)
    {
        HashSet<String> substrings = new HashSet<>();

        String temp;
        for (int i = 0; i <word.length()-1; i++) //it will not take the last item of string because we can not produce a string when there is a just one element in string
        {
            for (int j = i+1; j < word.length(); j++) //it will start from i+1 make it minimum length of substring 2 element
            {
                temp = word.substring(i,j+1);
                substrings.add(temp);
//                System.out.print("i:"+i+" j:"+j);
//                System.out.println(temp);
            }
        }

        return substrings;
    }
}
