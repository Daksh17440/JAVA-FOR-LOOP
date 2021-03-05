import java.util.Scanner;
class SumOfDigits
{
    public static void main(int n)
    {
        int d=0, sum=0;
        for(;n>0;n/=10)
        {
            d = n%10;
            sum = sum+d;
        }
        System.out.println("Sum of digits:\t"+sum);
    }
}
