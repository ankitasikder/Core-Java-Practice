public class
amstrong {

    public static void main(String[] args) {
        int a,rem,sum,t;
        t=153;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if (sum==t)

            System.out.println("Amstrong");
        else
            System.out.println(" not Amstrong");
    }

}
