     abstract class P {
        public  abstract void print1();
        public  abstract void print1a();
    }
    abstract class Q extends P{
        public void print1(){
            System.out.print("Print1,");
        }
        public abstract void print2();
    }
    abstract class R extends  Q{
        public void print2(){
            System.out.print("Print2,");
        }
    }
    class S extends R{
        public void print1a(){
            System.out.print("Print1a,");
        }
    }
    public class abstractclass{
        public static void main(String[] args){
            S s= new S();
            s.print1();
        }
    }

