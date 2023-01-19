import java.util.Arrays;

public class seiveOfEratosthenes
{
    public static void main(String args[])
    {

        seiveOfEratosthenes s=new seiveOfEratosthenes();
        System.out.println(s.seive(3));
        }
    public int  seive(int n)
    {
        int count=0;
        boolean arr[]=new boolean[n+1];
        if(n<=1)
        {
            return count ;
        }
       
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(arr[i])
            {
                for(int j=2*i;j<=n;j=i+j)
                {
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i])
            {
                count++;
            }
        }
        return count;
        
    }
}