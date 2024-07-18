public class ArrayInsertAtEnd {
    public static void insertAtEnd(int[] arr,int sizeOfArray,int element)
    {
        arr[sizeOfArray-1] = element;
    }
    public static void main(String[] args) {

       int[] arr = {1, 2, 3, 4, 5};
        int element = 90;

        insertAtEnd(arr, arr.length, element);

        for(int e: arr)
        {
            System.out.print(e + " ");
        }
    }
}
