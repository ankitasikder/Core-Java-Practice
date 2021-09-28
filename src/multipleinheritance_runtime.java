//hierarchical inheritance
import java.util.Scanner;
    class grandParent {
        void boom(){
            System.out.println("SakBoom");
        }
    }
    class c1 extends  grandParent{
        void boom1(){
            System.out.println("SakBoom1");
        }
    }
    class c2 extends grandParent{
        void boom2(){
            System.out.println("SakBoom2");
        }
    }
    public class multipleinheritance_runtime {
        public static void main(String[] args){
            c2 skb2 =new c2();
            c1 skb1 =new c1();
            grandParent skb =new grandParent();
            Scanner sc=new Scanner(System.in);
            int a;
            a=sc.nextInt();
            System.out.print(a+",");
            skb1.boom1();
            skb2.boom2();
            skb.boom();
        }
    }

