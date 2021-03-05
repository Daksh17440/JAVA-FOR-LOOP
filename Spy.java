import java.util.Scanner;
class Spy
{
    public static void main(int n)
    {
        int sum=0, p=1, d=0;
        for(int i=n;i>0;i/=10)
        {
            d = i%10;
            sum = sum+d;
            p = p*d;
        }
        if(sum == p)
        System.out.println("Spy no.");
        else
        System.out.println("not a Spy no.");
    }
}