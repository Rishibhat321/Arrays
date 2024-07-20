public class MinimumAdjacentDifferenceInACircularArray {

    public static int minAdjDiff(int[] arr, int n) {

        int diff=Integer.MAX_VALUE;
        int value=0;

        for(int i=0;i<n-1;i++)
        {
            value = Math.abs(arr[i+1]-arr[i]);

            if(value<diff)
            {
                diff=value;
            }
        }

        value=Math.abs(arr[n-1]-arr[0]);

        if(value<diff)
        {
            diff=value;
        }

        return diff;
    }
    public static void main(String[] args) {

        int[] arr = {8,-8,9,-9,10,-11,12};

        int res = minAdjDiff(arr, arr.length);

        System.out.println("Minimum adjacent difference in a circular array is: " + res);

       //  System.out.println(res);

    }
}
