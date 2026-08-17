import java.util.Scanner;
public class DemoScanner2 {
    public static void main(String [] args)
    {
        Scanner doc =new Scanner(System.in);
        System.out.println("Enter the age: ");
        int a=doc.nextInt();
        System.out.println("Age is: "+a);

        System.out.println("Enter the height: ");
        float b=doc.nextFloat();
        System.out.println("Height is: "+b); 

        doc.nextLine(); //This nextLine will help to store the space value between the name

        System.out.println("Enter Your Name: ");
        String name=doc.nextLine();
        System.out.println("Name is: "+name);

        System.out.println("Enter the any word: ");
        String word=doc.next();
        System.out.println("Word is: "+word);
        
    }
    
}
