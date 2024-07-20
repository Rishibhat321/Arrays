import java.util.*;

public class ArrayLeaders {
    public static ArrayList<Integer> leaders(int[] arr, int n){

        ArrayList<Integer> list = new ArrayList<Integer>();

        int max = arr[n-1];
        list.add(max);

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                list.add(max);
            }
        }

        Collections.reverse(list);


        return list;
    }
    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};

        ArrayList<Integer> res = leaders(arr, arr.length);

        System.out.println(res);


    }
}
