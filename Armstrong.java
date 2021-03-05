import java.util.Scanner;
class Armstrong
{
    public static void main(int n)
    {
        int sum=0, d=0;
        for(int i=n;i!=0;i=i/10)
        {
            d = i%10;
            int arm = d*d*d;
            sum = sum+arm;
        }
        if(sum == n)
        System.out.println("Armstrong no.");
        else
        System.out.println("not an Armstrong no.");
    }
}