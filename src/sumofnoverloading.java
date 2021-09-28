//2.  Add numbers between 1 to n. Create a class named Adder. Create a function named add() in this class. Then perform addition of 2 numbers and then 1 to n numbers using function overloading.
import java.util.Scanner;
import java.math.BigDecimal;
class Adder{
    void add(){
        BigDecimal bd1 = new BigDecimal("0.5");
        BigDecimal bd2 =new BigDecimal("0.8");
        System.out.print((bd1.add(bd2)));
    }
    void add(int m){
        int i,sum;
        sum=0;
        for(i=1;i<=m;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum is "+ sum);
    }
}
public class sumofnoverloading {
    public static void main(String[] args){
        int n;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        Adder a= new Adder();
        a.add(n);


    }
}
