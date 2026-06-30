import java.util.*;
class q11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=Math.min(n1,n2);
        int i,gcd=1;
        for(i=1;i<x;i++)
        {
            if(n1%i==0&&n2%i==0)
            {
                if(i>gcd) gcd=i;
            }
        }
        System.out.println("GCD="+gcd);
    }
}
