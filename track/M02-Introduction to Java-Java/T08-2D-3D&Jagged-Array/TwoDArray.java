import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner doc=new Scanner(System.in);
        int arr[][]=new int[3][5];
        System.out.println("Enter the Element in the Array: ");
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j]=doc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
