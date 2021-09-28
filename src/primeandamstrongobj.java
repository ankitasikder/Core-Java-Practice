/*1.	Create a class TakeInput. Then create 2 functions in this class. takelowerlimit and takeupperlimit.
        Create another class Logic. Then create 2 functions in this class. CheckPrime and CheckAmstrong.
        Create another class Printing. Then create 2 functions in this class. PrimeDisplay and AmstrongDisplay.
        Print all these things using object creation method in the main function.*/
import java.util.Scanner;
class TakeInput
{
    static int takelowerlimit(){
    Scanner sc=new Scanner(System.in);
    int low;
    low=sc.nextInt();
    return low;
    }
    static int takeupperlimit(){
        Scanner sc=new Scanner(System.in);
        int up;
        up=sc.nextInt();
        return up;
    }
}
class Logic{
    static boolean CheckPrime(int i)//for checking if a number is prime or not
    {
        int j,c;
        c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    static boolean CheckAmstrong(int n)//for checking if a number is amstrong or not
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
}
class Printing{
    static TakeInput t= new TakeInput();
    static Logic l= new Logic();
    static int t1=t.takelowerlimit();
    static int t2=t.takeupperlimit();
    static void PrimeDisplay(){
        int i;
        for(i=t1;i<=t2;i++)//for range
        {

            if(l.CheckPrime(i))
                System.out.println( i + " Is a prime number");
        }
    }
    static void AmstrongDisplay(){
        int j;
        for(j=t1;j<=t2;j++)//for range
        {
            if(l.CheckAmstrong(j))
                System.out.println( j + " Is a amstrong number");
        }
    }
}
public class primeandamstrongobj {
    public static void main(String[] args){
        Printing p = new Printing();
        p.PrimeDisplay();
        p.AmstrongDisplay();
    }

}
