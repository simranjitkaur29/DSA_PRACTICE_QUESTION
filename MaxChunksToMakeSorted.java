import java.util.*;
import java.lang.*;
import java.io.*;
public class MaxChunksToMakeSorted {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max[]=new int[n];
        max[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            max[i]=Math.max(max[i-1],arr[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(max[i]==i)
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
