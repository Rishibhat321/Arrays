import java.util.Stack;

public class Rearrange_Array_Alternately {

    public static void rearrange(long[] arr, int n){

        long[] a = new long[n];
        Stack<Long> stack = new Stack<Long>();

        int low=0;
        int high = n-1;
        int mid  = (low+high)/2;

        for(int i=mid+1;i<n;i++)
        {
            stack.push(arr[i]);
        }

        int k=0;
        int j=1;

        while(!stack.isEmpty()){
            a[k] = stack.pop();
            k += 2;
        }

        if(n%2!=0){

            for(int i=0;i<mid;i++)
            {
                a[j] = arr[i];
                j += 2;
            }

            a[n-1] = arr[mid];
        }

        else{
            for(int i=0;i<=mid;i++){
                a[j] = arr[i];
                j += 2;
            }
        }


        for(int i=0;i<a.length;i++)
        {
            arr[i] = a[i];
        }


    }

    public static void printArray(long[] arr)
    {
        for(long ele: arr)
        {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {

        long[] arr = {1,2,3,4,5,6};

        rearrange(arr, arr.length);

        System.out.println("Resultant array is: ");

        printArray(arr);

    }
}
