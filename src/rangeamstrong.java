public class rangeamstrong {
    public static void main(String[] args)
    {
        int i;
        for(i=1;i<=900;i++)//for range
        {
            if(isAmstrong(i))
             System.out.println( i + " Is a amstrong number");
           /* else
                System.out.println( i + " Is not a amstrong number");*/
        }
    }
    static boolean isAmstrong(int n)//for checking if a number is amstrong or not
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
