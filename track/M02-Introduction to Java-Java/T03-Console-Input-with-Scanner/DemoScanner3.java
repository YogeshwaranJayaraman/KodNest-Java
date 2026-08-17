import java.util.Scanner;
public class DemoScanner3 {
    public static void main(String[] args) {
       Scanner doc=new Scanner(System.in);
       System.out.println("Enter the Word");
       char a=doc.next().charAt(0);
       System.out.println("Char At Index 0 is: "+a);
       doc.close();  
    }
}
