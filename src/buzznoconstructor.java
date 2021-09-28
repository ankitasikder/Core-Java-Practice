//1.  Create a class named Buzznum. Create a parameterized constructor in this class. The logic part will be in this constructor. Create another function in this class named display(). Take runtime input in main() function. The printing statements in be in the display().
import java.util.Scanner;
class Buzznum{
    int f=0;
    Buzznum(int a){
        if(a % 7 == 0 || (a % 10) == 7)
            //System.out.println("The number is buzz number.");
            f=1;
    }
    void display(){
        if(f==1)
        System.out.println("The number is buzz number.");
        else
            System.out.println("The number is not buzz number.");
    }
}

public class buzznoconstructor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        Buzznum b= new Buzznum(m);
        b.display();

    }
}