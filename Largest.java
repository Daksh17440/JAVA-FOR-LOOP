import java.util.Scanner;
class Largest
{
    public static void main(int n)
    {
        int l=0;
        for(int i=n;i!=0;i=i/10)
        {
            int d=i%10;
            if(d>l)
            l=d;
        }
        System.out.println(l);
    }
}