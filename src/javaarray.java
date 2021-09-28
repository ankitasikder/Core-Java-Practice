//Take runtime input in an array and store the array in another array and store the array in reverse way in another array.
import java.util.Scanner;
public class javaarray {
    public static void main(String[] args)
    {
        int i,x,j;
        j=0;
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("take array1  input");
        for (i=0; i<a.length; i++)
        {
            x=sc.nextInt();
            a[i]=x;
        }
        for (i=0; i<b.length; i++)
        {
            b[i]=a[i];
        }
        for (i=(a.length-1); i>=0; i--)
        {
            c[j]=a[i];
            j++;
        }

        System.out.println("print array2  input");
        for (i=0; i<b.length; i++)
        {
            System.out.print(b[i]);
        }

        System.out.println("\nprint array reverse  input");
        for (i=0; i<b.length; i++)
        {

            System.out.print(c[i]);
        }
    }
}