//6.  Create an abstract class named Datedemo. Create fetchcurrentdate() abstract function in this class. Don’t create extra classes except Datedemo and main class. Fetch the current date using fetchcurrentdate().
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
abstract class Datedemo{
    abstract void fetchcurrentdate();
}
public class fetchcurrentdatecode extends Datedemo{
    void fetchcurrentdate(){
        LocalDateTime now = LocalDateTime.now();
        System.out.print(now);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd//MM/yyyy HH:mm:ss");
        System.out.print("\n"+dtf.format(now));
    }
    public static void main(String[] args){
        fetchcurrentdatecode fcb = new fetchcurrentdatecode();
        fcb.fetchcurrentdate();
    }
}
