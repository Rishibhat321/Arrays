public class Strongest_Neighbour {

    public static void maximumAdjacent(int sizeOfArray, int[] arr){

        int n= sizeOfArray;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.print(arr[i] + " ");
            }

            else{
                System.out.print(arr[i+1] + " ");
            }
        }

    }


    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,5};

        maximumAdjacent(arr.length, arr);

    }
}
