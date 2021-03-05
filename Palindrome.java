import java.util.Scanner;
class Palindrome
{
    public static void main(int n)
    {
        int rev=0, d=0;
        for(int i=n;i>0;i/=10)
        {
            d = i%10;
            rev = rev*10+d;
        }
        if(rev == n)
        System.out.println("Palindrome no.");
        else
        System.out.println("not a Palindrome no.");
    }
}
