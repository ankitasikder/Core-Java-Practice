//magic no.
/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
import java.util.Scanner;
class Magic1
{
    void magic1(){
        Scanner sc=new Scanner(System.in);
        int s=0,rem=0,n,s1=0;
        n=sc.nextInt();
        while(n!=0)
        {
            rem=n%10;
            s=s+rem;
            n=n/10;
        }
        while(s!=0)
        {
            rem=s%10;
            s1=s1+rem;
            s=s/10;
        }
        if(s1 * s == n)
            System.out.println(n+" This is Magic Number.");
        else
            System.out.println(n+" This is not Magic Number.");
    }
}
public class magicneon {
    public static void main(String[] args){
        Magic1 m = new Magic1();
        m.magic1();
    }

}

