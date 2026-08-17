class Addition {
    short add(short a,short b) {
        return (short)(a+b);
    }
    int add (int a,int b) {
        return a+b;
    }
    
}
public class CalApplication {
    public static void main(String [] args) {
        Addition ad=new Addition();
        System.out.println(ad.add(5,10));
        
    }
    

}
