public class Main {

    public static void main(String[] args)
    {
        int[] height = {1,8,6,2,5,4,8,3,7};

        //Example 1:
        System.out.println(maxArea(height));

        //Example 2:
        height = new int[]{1, 1};
        System.out.println(maxArea(height));

    }

    public static int maxArea(int[] height)
    {
        int maxArea = 0;
        int currentArea;
        for (int i = 0; i < height.length - 1 ; i++) //there must be a gap between two vertical lines
        {
            for (int j = i+1; j < height.length; j++)
            {
                currentArea = (j - i) * Math.min(height[i],height[j]); // j is always bigger than i, and smaller edge will determine the water container edge
                if (currentArea > maxArea)
                {
                    maxArea = currentArea;
                }
            }
        }

        return maxArea;
    }
}
