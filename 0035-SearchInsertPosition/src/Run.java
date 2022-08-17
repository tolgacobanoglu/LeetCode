import java.util.Arrays;

public class Run
{
    public static void main(String[] args)
    {
        //Example 1:
        int[] arr1 = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(arr1,target));

        //Example 2:
        arr1 = new int[]{1, 3, 5, 6};
        target = 2;
        System.out.println(searchInsert(arr1,target));

        //Example 3:
        arr1 = new int[]{1, 3, 5, 6};
        target = 7;
        System.out.println(searchInsert(arr1,target));
    }

    public static int searchInsert(int[] numbers,int target)
    {
        int closestElement = findClosest(numbers,target);
        int newestIndex = Arrays.binarySearch(numbers,closestElement);

        if (target>closestElement)
        {
            newestIndex++;
        }

        return newestIndex;
    }

    // Returns element closest to target in arr[]
    public static int findClosest(int[] arr, int target)
    {
        int n = arr.length;

        // Corner cases
        if (target <= arr[0])
            return arr[0];
        if (target >= arr[n - 1])
            return arr[n - 1];

        // Doing binary search
        int i = 0, j = n, mid = 0;
        while (i < j) {
            mid = (i + j) / 2;

            if (arr[mid] == target)
                return arr[mid];

            /* If target is less than array element,
               then search in left */
            if (target < arr[mid]) {

                // If target is greater than previous
                // to mid, return closest of two
                if (mid > 0 && target > arr[mid - 1])
                    return getClosest(arr[mid - 1],
                            arr[mid], target);

                /* Repeat for left half */
                j = mid;
            }

            // If target is greater than mid
            else {
                if (mid < n-1 && target < arr[mid + 1])
                    return getClosest(arr[mid],
                            arr[mid + 1], target);
                i = mid + 1; // update i
            }
        }

        // Only single element left after search
        return arr[mid];
    }

    // Method to compare which one is the more close
    // We find the closest by taking the difference
    //  between the target and both values. It assumes
    // that val2 is greater than val1 and target lies
    // between these two.
    public static int getClosest(int val1, int val2,
                                 int target)
    {
        if (target - val1 >= val2 - target)
            return val2;
        else
            return val1;
    }
}
