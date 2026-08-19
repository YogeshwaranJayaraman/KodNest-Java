import java.util.Scanner;
public class ThreeDArray {
    public static void main(String[] args) {
        Scanner doc=new Scanner(System.in);
        int arr[][][]=new int[2][2][5];
        System.out.println("Enter the Element in the Array: ");
        for(int i=0;i<=arr.length-1;i++) {
            for (int j=0;j<=arr[i].length-1;j++) {
                for(int k=0;k<=arr[i][j].length-1;k++) {
                    arr[i][j][k]=doc.nextInt();
                }
            }
        }
        System.out.println("Array Element are: ");
        for(int i=0;i<=arr.length-1;i++) {
            for (int j=0;j<=arr[i].length-1;j++) {
                for(int k=0;k<=arr[i][j].length-1;k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }  
}
