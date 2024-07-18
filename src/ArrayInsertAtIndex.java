public class ArrayInsertAtIndex {
    public static void insertAtIndex(int[] arr,int sizeOfArray,int index,int element)
    {
        if(index == sizeOfArray-1){
            arr[sizeOfArray-1] = element;
        }

        for(int i=sizeOfArray-1;i>index;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[index] = element;
    }
    public static void main(String[] args) {

        int sizeOfArray = 6;
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int index = 5;
        int element = 90;

        insertAtIndex(arr, sizeOfArray, index, element);

        for(int ele:arr){
            System.out.print(ele + " ");
        }

    }
}
