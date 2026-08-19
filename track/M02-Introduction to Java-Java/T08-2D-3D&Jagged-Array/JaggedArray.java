import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner doc =new Scanner(System.in);
        int arr[][]=new int[3][];
        arr[0]=new int[5];
        arr[1]=new int[1];
        arr[2]=new int[2];
        System.out.println("Enter the Array Element: ");
        for (int i=0;i<=arr.length-1;i++) {
            for(int j=0;j<=arr[i].length-1;j++) {
                arr[i][j]=doc.nextInt();
            }
        }
        System.out.println("Jagged Array: ");
         for (int i=0;i<=arr.length-1;i++) {
            for(int j=0;j<=arr[i].length-1;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    } 
}