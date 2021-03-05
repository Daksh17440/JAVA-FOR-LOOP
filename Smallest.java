import java.util.Scanner;
class Smallest
{
    public static void main(int n)
    {
        int s=9;
        for(int i=n;i!=0;i=i/10)
        {
            int d=i%10;
            if(d<s)
            s=d;
        }
        System.out.println("Smallest digit:\t"+s);
    }
}