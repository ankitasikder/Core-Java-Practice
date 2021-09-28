//2
//0 2 10
//5 3 5
//output
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98
//a b n
//(a+2^0b) (a+2^0b+2^1b) (a+2^0b+2^1b+...+2^(n-1)b)
import java.util.Scanner;
class Series
{
    int power(int a, int b){//for power
        int k,mul;
        mul=1;
        for(k=0;k<b;k++)
        {
            mul=mul*a;
        }
        return mul;
    }
}
public class SpecialSeries {
    public static void main(String[] args){
        int tn,sum,a,b,n;
        sum=0;
        Series s= new Series();
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        //System.out.println("Pow "+s.power(2,4));
        tn = sc.nextInt();
        for(int i=1;i<=tn;i++){//for taking 3 inputs for each times
            a= sc.nextInt();
            b= sc.nextInt();
            n= sc.nextInt();
            sum=a;
            for(int j=0;j<n;j++)//for term
            {
                sum=sum+((s.power(2,j))*b);
                System.out.print(sum+",");
            }
            System.out.println();
        }
    }
}
