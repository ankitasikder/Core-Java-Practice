public class specialnum {
    public static void main(String[] args)
    {
        int i;
        for(i=1;i<=900;i++)
        {
            if(isSpecial(i))
                System.out.println( i + " Is a Special number");

        }
    }
    static boolean isSpecial(int n)
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem

            );
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
}
