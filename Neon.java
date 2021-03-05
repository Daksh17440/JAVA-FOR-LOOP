import java.util.Scanner;
class Neon
{
    public static void main(int n)
    {
        int sum=0, sq=n*n;
        for(int i=sq;i>0;i=i/10)
        {
            int d=i%10;
            sum = sum+d;
        }
        if(sum==n)
        System.out.println("Neon");
        else
        System.out.println("not Neon");
    }
}