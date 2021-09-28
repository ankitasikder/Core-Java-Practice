//3.	Print Fibonacci Numbers/Series using simple class object concept.
import java.util.Scanner;
class fibonacci1{
    static void fibonaccifunc1(){
        int a,b,c,i;
        a=0;
        b=1;
        Scanner sc=new Scanner(System.in);
        int up;
        up=sc.nextInt();
        System.out.println(0 + "\n" +1);
        for(i=2;i<up;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
public class fibonacciobj {
    public static void main(String[] args) {
        fibonacci1 f= new fibonacci1();
        f.fibonaccifunc1();

    }

}
