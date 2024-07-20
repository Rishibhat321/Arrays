public class WhoHasTheMajority {

    public static int majorityWins(int[] arr, int n, int x, int y) {

        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                c1 +=1;
            }
            else if(arr[i]==y)
            {
                c2 +=1;
            }
        }

        if(c1>c2)
        {
            return x;
        }

        if(c1<c2)
        {
            return y;
        }


        if(c1==c2)
        {
            if(x<y)
            {
                return x;
            }
        }

        return y;
    }
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,4,4,4,5};
        int x = 4;
        int y = 5;

        int res = majorityWins(arr, arr.length, x, y);

        System.out.println(res);

    }
}
