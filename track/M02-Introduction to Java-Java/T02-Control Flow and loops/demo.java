import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);
     int choice=-1;
        while(choice<0||choice>5) {
            System.out.println("Enter course choice: ");
            choice=doc.nextInt();
            if(choice<0||choice>5){
                System.out.println("Invalid course choice. Select a value from 1 to 5.");
                System.out.println();
            }
        }
    
    }
}
