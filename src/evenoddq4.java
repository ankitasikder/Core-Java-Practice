/*2.	Create an abstract classEvenOddCheck. Create an abstract function in this abstract class named Logic. Here the logic of even odd checking will be kept. Then create another class PrintEvenOdd. This class will inherit the previous class. At last, create main function to check even odd.
 */
import java.util.Scanner;
abstract class EvenOddCheck{
    public abstract void logic();
}
class PrintEvenOdd extends EvenOddCheck{
    public void logic(){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a%2==0)
            System.out.println( a+" is even number");
        else
            System.out.println( a+" is odd number");
    }
}
public class evenoddq4 {
    public static void main(String[] args) {
        PrintEvenOdd ob= new PrintEvenOdd();
        ob.logic();
    }
}
