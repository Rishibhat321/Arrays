public class RotateArray {

  public static void reverse(int[] arr, int low, int high)
    {
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
   public static void rotateArr(int[] arr, int d, int n)
    {
        if (n <= 0 || d < 0) {
            return;
        }

        d= d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void printArray(int[] arr){

      for(int ele : arr){
          System.out.print(ele + " ");
      }
    }
    public static void main(String[] args) {

      int[] arr = {1,2,3,4,5};
      int d=2;

      rotateArr(arr, d, arr.length);

        System.out.println("Resultant array is: ");

        printArray(arr);

    }
}
