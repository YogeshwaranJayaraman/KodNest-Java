import java.util.Scanner;
public class DemoScanner {
    public static void main(String[] args) {
       Scanner doc=new Scanner(System.in);
       System.out.println("Enter byte value");
       byte a=doc.nextByte();
       System.out.println("Byte Value is: "+a);

       System.out.println();
       System.out.println("Enter short value");
       short b=doc.nextShort();
       System.out.println("Short Value is: "+b);
        
       System.out.println();
       System.out.println("Enter int value");
       int c=doc.nextInt();
       System.out.println("Int Value is: "+c);

       System.out.println();
       System.out.println("Enter long value");
       long d=doc.nextLong();
       System.out.println("Long Value is: "+d); 

       System.out.println();
       System.out.println("Enter float value");
       float e=doc.nextFloat();
       System.out.println("Float Value is: "+e);

       System.out.println();
       System.out.println("Enter double value");
       double f=doc.nextDouble();
       System.out.println("Double Value is: "+f);

       System.out.println();
       System.out.println("Enter boolean value");
       boolean g=doc.nextBoolean();
       System.out.println("Boolean Value is: "+g);
        
    }
}
