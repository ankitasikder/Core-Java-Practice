import java.util.*;
import java.util.Scanner;

//8.  Create class named Takeinput2. Create 2 functions named takelowerlimit() and takeupperlimit(). Create 3 functions named takethreedigit(), takestring(), takearray(). Create object in main() and take the runtime  inputs and using takelowerlimt() and takeupperlimit() check buzz no., amstrong no., krishnamurti no. Check magic number using takethreedigit().Count vowels and consonents in a string using takestring(). Print reverse of an array using takearray(). There should not be extra classes except main and Takeinput2. Don’t use inheritance.
/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/


class Takeinput2{
    int takelowerlimit(){

        System.out.println("Enter the lower limit");
        int low;
        Scanner sc=new Scanner(System.in);
        low=sc.nextInt();
        return low;
    }
    int takeupperlimit(){
        System.out.println("Enter the upper limit");
        int up;
        Scanner sc=new Scanner(System.in);
        up=sc.nextInt();
        return up;
    }
    int take3digit(){
        {
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            return n;
        }
    }
    String takestring() {
        {
            Scanner sc = new Scanner(System.in);
            String s1;
            s1= sc.nextLine();
            return s1;
        }
    }
    static int[] takearray(){
        int[] a = new int[5];
        int i,x;
        Scanner sc= new Scanner(System.in);
        for (i=0; i<a.length; i++)
        {
            x=sc.nextInt();
            a[i]=x;
        }
        return a;

    }


    public int sumofdigitformagic( int n)
    {
        int sum=0,r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public boolean ismagic(int n)
    {
        while(n>9)
        {
            n=sumofdigitformagic(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }

}
public class no8 {
    static boolean isAmstrong(int n)//for checking if a number is amstrong or not
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
    static boolean Buzznum(int a){
        if(a % 7 == 0 || (a % 10) == 7)
            //System.out.println("The number is buzz number.");
            return true;
        else
            return false;
    }
    static boolean issomman(int n)//checking if a number is somman number
    {
        int a,rem,sum,t;
        t=n;
        a=t;
        sum=0;
        while(a!=0)
        {
            rem=a%10;
            sum=sum+(factorialof(rem));//func calling
            a=a/10;
        }
        if (sum==t)

            return true;
        else
            return false;
    }
    static int factorialof(int m){//calculating factorial of a number
        {
            int j,fact;
            fact=1;
            for(j=1;j<=m;j++)
            {
                fact=fact*j;
            }
            return fact;
        }
    }

    static void vowelcon(){

        Takeinput2 t= new Takeinput2();
        String s1;
        s1 = t.takestring();
        char a[]= new char[20];
        a=s1.toCharArray();
        int i, v = 0, sp = 0, c = 0, l = 0, ch = 0;
        for (i = 0; i<a.length; i++)
        {
            ch++;
            switch (a[i]) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    v++;
                    break;
                default:
                    c++;
            }

        }
        System.out.println("Vowel is " + v);
        System.out.println("Consonant is " + c);

    }

    static void reverse() {
        Takeinput2 t = new Takeinput2();
        int[] a = new int[5];
        int i;
        System.out.println("Take the array input");
        a= t.takearray();
        for (i=(a.length-1); i>=0; i--)
        {
            System.out.println(a[i]);
        }
    }


    public static void main (String[] args){
        Takeinput2 t= new Takeinput2();
        int a,b;
        a=t.takelowerlimit();
        b=t.takeupperlimit();

        for(int i=a;i<=b;i++)
        {
            if(isAmstrong(i)){
                System.out.println(i+" Armstrong No.");
            }
            if(issomman(i)){
                System.out.println(i+" Krishnamurti No.");
            }
            if (Buzznum(i)) {
                System.out.println(i+" Buzz No.");
            }
        }
        System.out.println("ENTER A 3 DIGIT NO. TO CHECK ITS MAGIC OR NOT");
        int aa= t.take3digit();
        if(t.ismagic(aa))
            System.out.println(aa+" Magic No.");
        else
            System.out.println(aa+" is not a Magic No.");



        System.out.println("Take a string for vowel check");
        vowelcon();
        reverse();




    }

}
