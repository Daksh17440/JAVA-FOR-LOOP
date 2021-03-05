import java.util.Scanner;
class Pronic
{
    public static void main(int n)
    {
        int p, c=0;
        for(int i=1;i<=n;i++)
        {
            p=i*(i+1);
            if(p==n)
            {
                c++;
                break;
            }
        }
        if(c==1)
        System.out.println("Pronic");
        else
        System.out.println("not Pronic");
    }
}