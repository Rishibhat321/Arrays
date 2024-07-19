public class EaseTheArray {

   public static void modifyAndRearrangeArr(int[] arr, int n) {

        int count =0;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=0 && arr[i]==arr[i+1])
            {
                arr[i] = arr[i] + arr[i+1];
                arr[i+1]=0;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

    }

    public static void printModified(int[] arr)
    {
        System.out.println("The modified array is: ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

       int[] arr = {2, 2, 0, 4, 0, 8};

        modifyAndRearrangeArr(arr, arr.length);

        printModified(arr);

    }
}
