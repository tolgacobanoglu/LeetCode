import java.util.Arrays;

public class App 
{
    public static void main(String[] args) throws Exception 
    {    
        //Example 1:
        String[] elements = {"flower","flow","flight"}; 
        System.out.println(longestCommonPrefix(elements));

        //Example 2:
        elements = new String[]{"dog","race","car"};
        System.out.println(longestCommonPrefix(elements));

        //Example 3:
        elements = new String[]{"a","ab"};
        System.out.println(longestCommonPrefix(elements));

        //Example 4:
        elements = new String[]{"",""};
        System.out.println(longestCommonPrefix(elements));
        
        //Example 5:
        elements = new String[]{""};
        System.out.println(longestCommonPrefix(elements));
    }

    public static String longestCommonPrefix(String[] elements)
    {
        if(elements[0] == "")  //    0 <= strs[i].length <= 200
        {
            return "";
        }

        if(elements.length == 1)    //  1 <= elements.length <= 200
        {
            return elements[0];
        }

        Arrays.sort(elements, (a, b)->Integer.compare(a.length(), b.length())); // make it for to take first element of array and take first element to base and measure to simularity with minimum length of element

        char[] letters = elements[0].toCharArray(); // make it for to base model
        char temp = letters[0];
        int counter = 0; //to count is elements match with temp char value

        StringBuilder longestCommonPrefix = new StringBuilder(); //to append a char to String

        for (int i = 0; i < letters.length; i++) 
        {
            for (int j = 1; j < elements.length; j++) 
            {
                if(letters[i] == elements[j].charAt(i))
                {
                    counter++;
                }
                temp = letters[i];
            }
            if(counter == elements.length-1)
            {
                longestCommonPrefix.append(temp);
            }
            counter = 0;
        }
        
        return longestCommonPrefix.toString();
    }

}