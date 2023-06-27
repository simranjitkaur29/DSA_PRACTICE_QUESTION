
import java.util.*;
 import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class RainWaterTrapping
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        long lmax[]=new long[n];
        lmax[0]=a[0];
        for(int i=1;i<n;i++)
        {
            lmax[i]=Math.max(lmax[i-1],a[i]);
        }
        long rmax[]=new long[n];
        rmax[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(rmax[i+1],a[i]);
        }
        long ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=Math.min(lmax[i],rmax[i])-a[i];
        }
        System.out.println(ans);
    }
}