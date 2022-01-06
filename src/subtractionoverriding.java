//7.  Create a class named Subtractor. Create a parameterized function named sub() in this class. Create another 3 classes named Subtractorsubclass1, Subtractorsubclass2 and Subtractorsubclass3. These classes will be in hierarchical inheritance. Subtractor will be the grandparent. Print 3 different results in 3 different subclasses using function overriding. Create only object for the grandparent class. Print the results of subclasses using reference variable.
/*CREATED BY ANKITA SIKDER
email id: ankita.sikder@gmail.com
*/
import java.math.BigDecimal;
class Subtractor {
    BigDecimal Sub(float a, float b) {
        BigDecimal bd1 = new BigDecimal(a);
        BigDecimal bd2 = new BigDecimal(b);
        return (bd1.subtract(bd2));
    }
}
class Subtractorsubclass1 extends Subtractor{
    BigDecimal Sub(float x, float y){
        BigDecimal bd1 = new BigDecimal(x);
        BigDecimal bd2 = new BigDecimal(y);
        return (bd1.add(bd2));
    }
}
class Subtractorsubclass2 extends Subtractor{
    BigDecimal Sub(float x, float y){
        BigDecimal bd1 = new BigDecimal(x);
        BigDecimal bd2 = new BigDecimal(y);
        return (bd1.multiply(bd2));
    }
}
class Subtractorsubclass3 extends Subtractor{
    BigDecimal Sub(float x, float y){
        BigDecimal bd1 = new BigDecimal(x);
        BigDecimal bd2 = new BigDecimal(y);
        return (bd1.divide(bd2));
    }
}
public class subtractionoverriding {
    public static void main(String[] args){
        Subtractor r = new Subtractorsubclass1();
        Subtractor s = new Subtractorsubclass2();
        Subtractor t = new Subtractorsubclass3();
        System.out.println(r.Sub(5,3));
        System.out.println(s.Sub(8,1));
        System.out.println(t.Sub(22,11));
    }
}
