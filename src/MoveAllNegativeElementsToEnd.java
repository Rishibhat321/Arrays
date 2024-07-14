import java.util.Stack;
public class MoveAllNegativeElementsToEnd {

    public static void segregateElements(int[] arr) {

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]<0)
            {
                stack.push(arr[i]);
            }
        }

        if(stack.isEmpty())
        {
            return;
        }

        int j=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                arr[j] = arr[i];
                j++;
            }
        }


        while(!stack.isEmpty())
        {
            arr[j] = stack.pop();
            j++;
        }

        System.out.println("Resulting array is : ");

        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};

        segregateElements(arr);

    }
}
