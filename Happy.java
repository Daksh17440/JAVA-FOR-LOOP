import java.util.Scanner;
class Happy
{
    public static void main(int n)
    {
        int d1, d2, p, sum=0, s=0;
        for(int i=n;i!=0;i/=10)
        {
            d1 = i%10;
            sum = sum+d1;
        }
        p = sum*sum;
        while(p!=0)
        {
            d2 = p%10;
            s = s+d2;
        }
        if(s == 1)
        System.out.println("Happy no.");
        else
        System.out.println("not a Happy no.");
    }
}
