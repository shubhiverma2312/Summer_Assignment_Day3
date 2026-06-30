import java.util.*;
class q9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n==1||n==0)
            System.out.println("NOT A PRIME NUMBER");
        int i,c=0;
        for(i=2;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==1)
            System.out.println("PRIME NUMBER");
        else
            System.out.println("NOT A PRIME NUMBER");
    }
}