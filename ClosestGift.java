import java.util.*;
public class ClosestGift
{
    public static boolean isPrime(long n)
    {
        long c=0;
        for(long i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }


    private void printClosestGiftDistance() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        long number=input.nextInt();
        long diff1=0,diff2=0;
        long num1=0,num2=0;
        long distance = 0;
        for(long i=number;;i++)
        {
            if(isPrime(i))
            {
                diff1=i-number;
                num1=i;
                break;
            }
        }
        for(long i=number;;i--)
        {
            if(isPrime(i))
            {
                diff2=number-i;
                num2=i;
                break;
            }
        }
        if(diff1<diff2)
            distance = Math.abs(num1-number);
        else if(diff2<diff1)
            distance = Math.abs(num2-number);
        else
            distance = Math.abs(num1-number);

        System.out.println("Shortest distance to gift is "+distance);
    }

    public static void main(String args[])
    {
       ClosestGift closestGift = new ClosestGift();
       closestGift.printClosestGiftDistance();
    }

}