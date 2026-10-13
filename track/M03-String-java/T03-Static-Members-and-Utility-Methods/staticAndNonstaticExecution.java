class demo {

    // Static Block Execute only one time
    static {
        System.out.println("1 st Static Block Executed");
    }
    static {
        System.out.println("2 st Static Block Executed");
    }
    static {
        System.out.println("3 st Static Block Executed");
    }

    // Non_Static Block Execute when the new Object will be Created

    {
       System.out.println("1 st Non Static Block Executed");  
    }
    {
       System.out.println("2 st Non Static Block Executed");  
    }
    {
       System.out.println("3 st Non Static Block Executed");  
    }
}
public class staticAndNonstaticExecution {
    public static void main(String[] args) {
     demo d1=new demo();  
     demo d2=new demo();  
     demo d3=new demo();  
    }
}
