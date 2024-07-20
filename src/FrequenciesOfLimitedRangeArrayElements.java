public class FrequenciesOfLimitedRangeArrayElements {

    public static void frequencyCount(int[] arr, int N, int P)
    {

        int[] a = new int[N];

        for(int i=0;i<N;i++)
        {
            a[i]=0;
        }

        for(int i=0;i<N;i++)
        {
            if(arr[i]<=N)
            {
                a[arr[i]-1]++;
            }
        }

        for(int i=0;i<N;i++)
        {
            arr[i] = a[i];
        }
    }

    public static void printArray(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 3, 5};
        int p = 5;

        frequencyCount(arr, arr.length, p);

        System.out.println("Resultant array is: ");

        printArray(arr);


    }
}
