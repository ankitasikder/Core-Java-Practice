public class factorial {
    public static void main(String[] args)
    {
        int f,j,fact;
        f=5;
        fact=1;
        for(j=1;j<=f;j++)
        {
            fact=fact*j;
        }
        System.out.println("Factorial of the number is " +fact);
    }
}
