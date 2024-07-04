public class EquilibruimPoint {
    public static int equilibriumPoint(long arr[], int n) {

        long rs=0;
        for(int i=0;i<n;i++)
        {
            rs= rs + arr[i];
        }

        long ls=0;
        for(int i=0;i<n;i++)
        {
            rs = rs-arr[i];
            if(ls==rs)
            {
                return (i+1);
            }

            ls = ls+arr[i];
        }
        return -1;

    }
    public static void main(String[] args) {

        long[] arr = {1, 3, 5, 2, 2};

        int res = equilibriumPoint(arr,arr.length);

        if(res==-1){
            System.out.println("No Equilibrium Point in array");
        }
        else{
            System.out.println(res);
        }

    }
}
