public class WaveArray {
    public static void convertToWave(int n, int[] a) {

        if(n==1)
        {
            return;
        }

        for(int i=0;i<n-1;i=i+2)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
    }

    public static void printArrayElements(int[] a)
    {
        for(int ele:a){
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {

        int[] a =  {1,2,3,4,5};

        convertToWave(a.length, a);

        System.out.println("Resultant array is: ");

        printArrayElements(a);

    }
}
