public class primeinrange {
    public static void main(String[] args)
    {
        int i;
        primenumber a = new primenumber();
        for(i=1;i<=20;i++)//for range
        {

            if(a.isPrime(i))
                System.out.println( i + " Is a prime number");
        }
    }

    }
class primenumber {
    boolean isPrime(int i)//for checking if a number is prime or not
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
}