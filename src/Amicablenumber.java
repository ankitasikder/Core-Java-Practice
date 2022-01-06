/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
import java.util.Scanner;
class Amica{
    static void isAmicable(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                sum1 += i;
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0)
                sum2 += i;
        }
        if (sum1 == sum2)
            System.out.println("Amicable.");
        else
            System.out.println("Amicable.");
    }
}
public class Amicablenumber {
    public static void main(String[] args){
        Amica a = new Amica();
        a.isAmicable();
    }
}
