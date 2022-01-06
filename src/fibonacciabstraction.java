//5.	Print Fibonacci Numbers/Series using abstraction.
/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
import java.util.Scanner;

abstract class fibonacciabstract{
    public abstract void fibonacci2();
}
class fibona extends fibonacciabstract{
    public void fibonacci2(){
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
public class fibonacciabstraction{
    public static void main(String[] args){
        fibona m= new fibona();
        m.fibonacci2();
    }
}
