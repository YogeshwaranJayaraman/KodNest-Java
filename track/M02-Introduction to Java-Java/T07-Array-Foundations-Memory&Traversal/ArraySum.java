import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner doc=new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        System.out.println("Enter the Array Elements");
        for(int i=0;i<=arr.length-1;i++) {
            arr [i]=doc.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++) {
            sum=sum+arr[i];
        }
        System.out.println("Total: "+sum);
        doc.close(); 
    }
    
}
    