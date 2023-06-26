public class abc {
    public static void main(String args[])
    {
        gcdofNumber g=new gcdofNumber();
        System.out.println(g.gcd(6, 3));
    }
    public  int gcd(int i,int j)
    {
        if(j==0)
        {
            return i;
        }
        return gcd(j,i%j);

    }
}
