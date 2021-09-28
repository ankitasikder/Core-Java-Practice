//4.	Print Reverse of a number using inheritance.
import java.util.Scanner;
class reverse
{
    static void rev(){
        Scanner sc=new Scanner(System.in);
        int rem,a;
        rem=0;
        //a=256;
        a=sc.nextInt();
        while(a!=0)
        {
            rem=a%10;
            System.out.print(rem);
            a=a/10;
        }
    }

}
public class reversenuminheritance extends reverse{
    public static void main(String[] args) {
        rev();
    }
}