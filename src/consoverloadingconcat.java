import java.util.Scanner;
/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
//4.  Create a class. Create a parameterized constructor in this class. Then perform concatenation of 2, 3, 4, 5 strings consequently one after another using constructor overloading.
class Concat{
    Concat(String n1,String n2){
        StringBuilder str1 = new StringBuilder(n1);
        StringBuilder str2 = new StringBuilder(n2);
        System.out.print(str1.append(str2));
    }
    Concat(String n1,String n2,String n3){
        StringBuilder str1 = new StringBuilder(n1);
        StringBuilder str2 = new StringBuilder(n2);
        StringBuilder str3 = new StringBuilder(n3);
        System.out.print(str1.append(str2).append(str3));
    }
    Concat(String n1,String n2,String n3,String n4){
        StringBuilder str1 = new StringBuilder(n1);
        StringBuilder str2 = new StringBuilder(n2);
        StringBuilder str3 = new StringBuilder(n3);
        StringBuilder str4 = new StringBuilder(n4);
        System.out.print(str1.append(str2).append(str3).append(str4));
    }
    Concat(String n1,String n2,String n3,String n4,String n5){
        StringBuilder str1 = new StringBuilder(n1);
        StringBuilder str2 = new StringBuilder(n2);
        StringBuilder str3 = new StringBuilder(n3);
        StringBuilder str4 = new StringBuilder(n4);
        StringBuilder str5 = new StringBuilder(n5);
        System.out.print(str1.append(str2).append(str3).append(str4).append(str5));
    }
}
public class consoverloadingconcat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3,s4,s5;
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=sc.nextLine();
        s4=sc.nextLine();
        s5=sc.nextLine();

        Concat r= new Concat(s1,s2,s3,s4,s5);
    }
}

