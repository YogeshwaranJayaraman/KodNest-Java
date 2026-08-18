import java.util.Scanner;
public class ArrayMaxElement {
    public static void main(String[] args) {
        Scanner doc=new Scanner(System.in);
        int[] arr=new int[5];
        int max=arr[0]; 
        System.out.println("Enter the Array Elements");
        for(int i=0;i<=arr.length-1;i++) {
            arr[i]=doc.nextInt();
        }
        for(int i=1;i<=arr.length-1;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Maximum Element is: "+max);
        doc.close(); 
    }
    
}
