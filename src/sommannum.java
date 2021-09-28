//KRISHNAMURTY NUM
public class sommannum {
    public static void main(String[] args)
    {
        int i;
        for(i=1;i<=900;i++)//for range
        {
            if(issomman(i))//func calling
                System.out.println( i + " Is a somman number");
           /* else
                System.out.println( i + " Is not a amstrong number");*/
        }
    }

    static boolean issomman(int n)//checking if a number is somman number
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(factorialof(rem));//func calling
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
    static int factorialof(int m){//calculating factorial of a number
        {
            int j,fact;
            fact=1;
            for(j=1;j<=m;j++)
            {
                fact=fact*j;
            }
            return fact;
        }
    }
}
