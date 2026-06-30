import java.util.*;
class q12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int start=Math.max(n1,n2);
        int end=n1*n2;
        int i,lcm=0;
        for(i=start;i<=end;i++)
        {
            if(i%n1==0&&i%n2==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println("LCM="+lcm);
    }
}