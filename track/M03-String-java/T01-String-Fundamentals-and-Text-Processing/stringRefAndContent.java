public class string5 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="JaVa";
        if(s1 == s2) {
            System.out.println("Reference are Equal");
        } else {
            System.out.println("Reference are Not Equal");
        }
        
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }
    }
    
}
