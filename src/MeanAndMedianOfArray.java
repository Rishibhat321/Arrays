import java.util.*;
public class MeanAndMedianOfArray {
    //Function to find median of the array elements.
    public static int median(int[] A,int N)
    {

        Arrays.sort(A);
        if(N%2!=0)
        {
            int mid= (int)Math.floor(N/2);
            return A[mid];
        }

        else if(N%2==0)
        {
            int middle = N/2;
            int median = (int)Math.floor((A[middle] + A[middle-1])/2);
            return median;
        }

        return -1;

    }
    //Function to find median of the array elements.
    public static int mean(int[] A,int N)
    {
        int sum=0;
        int mean = 1;
        for(int i=0;i<N;i++)
        {
            sum= sum+ A[i];
        }
        mean =(int)Math.floor(sum/N);
        return mean;
    }
    public static void main(String[] args) {

        int[] A = {1, 2, 19, 28, 5};

        int res_median = median(A,A.length);
        int res_mean = mean(A,A.length);

        System.out.println("The median is: " + res_median);
        System.out.println("The mean is: " + res_mean);


    }
}
