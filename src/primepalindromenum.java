import java.util.Scanner;
class primepal {
    static void isPrimePalindrome(){
        Scanner sc = new Scanner(System.in);
        int n,rem=0,rev=0,d,f=0,j,c,i,f1;
        c=0;
        f1=0;
        System.out.println("Enter the no.-->");
        n= sc.nextInt();
        d=n;
        for(;n!=0;n=n/10)
        {
            rem=n%10;
            rev=(rev*10)+rem;
        }
        if(rev==d)
            f=1;
        else
            f=0;
        for(j=1;j<=n;j++)
        {
            if(n%j==0)
                c++;
        }
        if(c==2)
            f1=1;
        else
            f1=0;
        if(f==1 && f1==1)
            System.out.println("Primepalindrome.");
        else
            System.out.println("Not Primepalindrome.");

    }
}
public class primepalindromenum{
    public static void main(String[] args){
        primepal p =new primepal();
        p.isPrimePalindrome();
    }
}
