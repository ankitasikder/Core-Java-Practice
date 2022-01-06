/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
import java.awt.*;
import java.util.Scanner;
import static java.lang.Math.pow;
class Disa{
    void isDisarium(){
        Scanner sc = new Scanner(System.in);
        int rem,s,c,d,n;
        s=0;
        d=0;
        System.out.println("Enter the number::");
        n= sc.nextInt();
        System.out.println("Enter the number of digits::");
        c= sc.nextInt();
        d=n;
        for(;n!=0;n=(n/10))
        {
            rem=n%10;
            s= (int) (s+pow(rem,c));
            c--;
        }

        if(s==d)
            System.out.println("Disarum");
        else
            System.out.println(" Not Disarum");
    }
}
public class Disarumnum {
    public static void main(String[] args){
        Disa d= new Disa();
        d.isDisarium();
    }
}
