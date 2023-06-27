
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class RotateArray
{
    static void rvereseArray(long arr[],int start, int end)
    {
        long temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int k=r%n;
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        rvereseArray(arr,0,n-k-1);
        rvereseArray(arr,n-k,n-1);
        rvereseArray(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");

        }
    }
}