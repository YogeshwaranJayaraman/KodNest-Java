import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner doc =new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the Array Element: ");
        for(int i=0;i<=arr.length-1;i++) {
            arr [i]=doc.nextInt();
        }
        System.out.println("Elements in the Array: ");
        for(int i=arr.length-1;i>=0;i--) {
            System.out.println(arr[i]);
        }
        doc.close();
    }
}



