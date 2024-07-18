import java.util.*;
public class MaxAndSecondMax {

    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int[] arr)
    {
        int temp=0;
        ArrayList<Integer> array= new ArrayList<Integer>();

        int max = arr[0];
        int max2= -1;
        for(int i=1;i<sizeOfArray;i++)
        {
            if(arr[i]>max)
            {
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max)
            {
                max2=arr[i];
            }
        }
        array.add(max);
        array.add(max2);
        return array;

    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        ArrayList<Integer> res = largestAndSecondLargest(n, arr);

        System.out.println(res);


    }
}
