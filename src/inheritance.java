class A
{
    static String hello(){
        return "Hello ";
 }
}
class B extends A
{
    static String Iam(){
        return hello()+"I am ";
    }
}
class C extends B
{
    static String ankita(){
        return Iam()+"Ankita ";
    }
}
class D extends C
{
    static String sikder(){
        return ankita()+"Sikder ";
    }
}
class E extends D
{
    static String student(){
        return sikder()+"student ";
    }
}
class F extends E
{
    static String ofcsit(){
        return student()+"of CSIT ";
    }
}
class G extends F
{
    static String btech(){
        return ofcsit()+"BTECH ";
    }
}
class H extends G
{
    static String uemk(){
        return btech()+"UEMK.";
    }
}
public class inheritance extends H{
    public static void main(String[] args)
    {
        System.out.println(uemk());
    }
}
