import java.util.Scanner;
import java.io.*;
public class filehandling {
    public static void main(String[] args) throws IOException{
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password : ");
        s=sc.nextLine();
        File f = new File("password.txt");
        FileWriter fw = new FileWriter("password.txt");
        fw.write(s);
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader(f));
        String st, pass;
        while ((st = br.readLine()) != null) {
            System.out.println(st + ",Enter the Password::");
            pass = sc.nextLine();
            while ((st = br.readLine()) != null) {
                if (st.equals(pass)) {
                    System.out.print("Password Match!!!");
                }
                else
                    System.out.print("Password Not Match!!!");
            }
        }

    }

}
