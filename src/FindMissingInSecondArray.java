import java.util.*;
import java.util.HashSet;

public class FindMissingInSecondArray {

    public static ArrayList<Integer> findMissing(int[] a, int[] b, int n, int m)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();


        for(int i=0;i<m;i++)
        {
            set.add(b[i]);
        }

        for(int i=0;i<n;i++)
        {
            if(!set.contains(a[i]))
            {
                list.add(a[i]);
            }
        }

        return list;
    }
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 10};
        int[] b = {2, 3, 1, 0, 5};

        ArrayList<Integer> res = findMissing(a, b, a.length, b.length);

        System.out.println(res);

    }
}
