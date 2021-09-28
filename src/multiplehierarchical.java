//Multiple Inherritance can't be done using classes in java example
/*
class grandParentForMI{
    void fun(){
        System.out.println("Grand");
    }
}
class Parent1 extends grandParentForMI{


    void fun() {

        System.out.println("Parent1");
    }
}

class Parent2 extends grandParentForMI{


    void fun() {

        System.out.println("Parent2");
    }
}


class  multiplehierarchical extends Parent1,Parent2 {


    public static void main(String args[]) {


        multiplehierarchical t = new multiplehierarchical();

        t.fun();
    }
}
*/
interface PARENT1{
    default void pok1(){
        System.out.println("Parent-1");
    }
}
interface PARENT2{
    default void pok2(){
        System.out.println("Parent-2");
    }
    default void pok3(){
        System.out.println("Parent-2");
    }
}
public class multiplehierarchical implements  PARENT1,PARENT2{ //implements---->extends
    public static void main(String[] args){
        multiplehierarchical o = new multiplehierarchical();
        o.pok2();
        o.pok3();
        o.pok1();
    }
}