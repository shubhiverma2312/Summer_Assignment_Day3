import java.util.*;
class q10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range 1 to:");
        int n=sc.nextInt();
        int i,j,c;
        for(i=2;i<=n;i++)
        {
            c=0;
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==1)
                System.out.println(i);
        }
    }
}