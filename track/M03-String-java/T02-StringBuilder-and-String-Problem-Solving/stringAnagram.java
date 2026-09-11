import java.util.*;
public class stringAnagram {
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);
        System.out.println("Enter the String 1 and String 2: ");
        String str1=doc.next();
        String str2=doc.next();
            boolean isAnagram=true;
        if(str1.length()!=str2.length()) {
           isAnagram=false;
        } else {
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            String sortedStr1=new String(arr1);
            String sortedStr2=new String(arr2);
           
            if(!(sortedStr1.equalsIgnoreCase(sortedStr2))) {
                isAnagram=false;
            }   
        }
        if(isAnagram) {
            System.out.println("Given Strings are Anagram");
        } else {
            System.out.println("Given Strings are Not a Anagram");
        }
    }
}
