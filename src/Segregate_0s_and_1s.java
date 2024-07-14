public class Segregate_0s_and_1s {
    public static void segregate0and1(int[] arr) {

        int res=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                int temp = arr[res];
                arr[res] = arr[i];
                arr[i] = temp;

                res++;
            }
        }

        System.out.println("The resulting array is:");

        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr);

    }
}
