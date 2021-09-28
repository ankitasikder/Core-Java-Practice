import java.util.Scanner;
class ISBN {
    void isbnnum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.-->");
        int n,d,rem,c,s1,s;
        s1=0;
        c=0;
        s=1;
        n= (int) sc.nextLong();
        d=n;
        for(;n!=0;n=(n/10))
        {
            rem=n%10;
            c++;
            s=c*rem;
            s1=s1+s;
        }
        if(s1%11==0)
            System.out.println("ISBN");
        else
            System.out.println("not ISBN");
    }
}
public class ISBNnum {
    public static void main(String[] args){
        ISBN i =new ISBN();
        i.isbnnum();
    }
}