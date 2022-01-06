//3.  Create 4 classes named Sc, Stu, Stl, Scmp. These classes will be in multlevel inheritance consequently. (i) Perform concatenation of 2 strings in Sc class. (ii) Convert a string in to upper class in Stu class. (iii) Convert a string in to lower class in Stl class. (iv) Compare 2 strings in Scmp class. Take the string in runtime input in main function. Also create a menu for choosing option.
/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
import java.util.*;
class Sc{
    void concat(String n1,String n2){
        StringBuilder str1 = new StringBuilder(n1);
        StringBuilder str2 = new StringBuilder(n2);
        System.out.print(str1.append(str2));
    }
}
class Stu extends Sc{
    void upper(String n1){
        StringBuilder str1 = new StringBuilder(n1);
        System.out.print(n1.toUpperCase());
    }

}
class Stl extends Stu{
    void lower(String n1){
        StringBuilder str1 = new StringBuilder(n1);
        System.out.print(n1.toLowerCase());
    }

}
class Scmp extends Stl{
    void compare(String n1,String n2){
        StringBuilder str1 = new StringBuilder(n1);
        StringBuilder str2 = new StringBuilder(n2);
        System.out.print(str1.compareTo(str2));
        if(n1==n2)
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}
public class stringmultilevel extends Scmp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        Scmp m= new Scmp();
        s1=sc.nextLine();
        s2=sc.nextLine();
//        m.concat(s1,s2);
//        m.lower(s1);
//        m.upper(s1);
//        m.compare(s1,s2);
        System.out.println("1. Concatenate two strings.");
        System.out.println("2. Convert to upper case.");
        System.out.println("3. Convert to lower case.");
        System.out.println("4. Compare 2 strings.");
        System.out.print("Enter Your Choice : ");
        int ch;
        ch=sc.nextInt();
        switch(ch) {
            case 1:
                m.concat(s1,s2);
                break;
            case 2:
                m.upper(s1);
                break;
            case 3:
                m.lower(s1);
                break;
            case 4:
                m.compare(s1,s2);
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
