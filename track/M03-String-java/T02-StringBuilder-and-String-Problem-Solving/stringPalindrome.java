import java.util.Scanner;
public class stringPalindrome {
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = doc.next();
        char[] charArr = str.toCharArray();
        char[] revArr = new char[charArr.length];
        int j=revArr.length-1;
        for (int i=0;i<charArr.length;i++){
            revArr[j] = charArr[i];
            j--;
        }
        String strArr = new String(revArr);
        if(str.equalsIgnoreCase(strArr)) {
            System.out.println("The Given String is Palindrome...");
        } else {
           System.out.println("The Given String is NOT a Palindrome...");  
        }
    }
}