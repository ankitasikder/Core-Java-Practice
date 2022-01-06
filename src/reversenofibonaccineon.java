import java.util.Scanner;
//5.  Create a class named Reversenumclass. Then create a function named reversenum() in this class. Create 2nd class named Fibonacciprint. Create a functionnamed fibbonacci() in this class. Create a class named Neonnumclass. Then create a function named neonnum() in this class. These 3 functions will be void. Take runtime inputs in these functions. These classes will be in multilevel inheritance consequently. The main() containing class will not inherit any previous classes. Only create an object for Neonnumclass in main().
//Hint: Use Super class.
/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
class Reversenoclass{
    Reversenoclass(){
        reverseno();
    }
    static void reverseno(){
        Scanner sc=new Scanner(System.in);
        int rem,a,sum;
        rem=0;
        sum=0;
        a=sc.nextInt();
        while(a!=0)
        {
            rem=a%10;
            sum=(sum*10)+rem;
            a=a/10;
        }
        System.out.println(sum+" This is Reverse.");
    }
}
class Fibonacciprint extends Reversenoclass {
    Fibonacciprint(){
        super();
        fibonacci();

    }
    void fibonacci() {
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
            System.out.println(c+" This is Fibonacci.");
            a=b;
            b=c;
        }
    }
}
class Neonclass extends Fibonacciprint{
    Neonclass(){
        super();
        neon();
    }
    void neon(){
        int f, rem, s = 0, m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        f = m * m;
        for (; f != 0; f = (f / 10)) {
            rem = f % 10;
            s = rem + s;
        }
        if (s == m)
            System.out.println(m + " Is Neon Number.");
        else
            System.out.println(m + " Is not Neon Number.");
    }
}
public class reversenofibonaccineon {
    public static void main(String[] args){
            Neonclass n =new Neonclass();
    }
}
