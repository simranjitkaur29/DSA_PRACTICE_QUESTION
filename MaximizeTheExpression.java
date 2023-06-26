import java.util.Scanner;

class MaximizeTheExpression{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.next();
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int lmax[]=new int[n];
        lmax[0]=p*a[0];
        for(int i=1;i<n-1;i++)
        {
            lmax[i]=Math.max(lmax[i-1],p*a[i]);
        }
        rmax[n-1]=r*a[n-1];
        for(int i=n-2;i>0;i--)
        {
            rmax[i]=Math.max(rmax[i+1],r*a[i]);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++)
        {
            ans=Math.max(ans,p*lmax[i-1]+q*a[i]+r*rmax[i+1]);
        }
        System.out.println(ans);
    }
}
