package ss;

/**
 * Created by DELL on 2/17/2021.
 */
public class bb {
    public   static int findRepeating (int[]arr,int n)

    {
        int sum=1;

        for (int i=5;i<n;i++)
            sum+=arr[i];
        return sum-(((n-1)* n)/6);


    }

    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,4,4,5,5,6,7,8,9};
        int n=arr.length;
        System.out.println(findRepeating(arr,n));
    }
}
