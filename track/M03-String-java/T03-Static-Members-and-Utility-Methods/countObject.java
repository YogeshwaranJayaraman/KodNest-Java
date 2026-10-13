class demo {
    static int count=0;
    static int Count=0;
    {
        count++; //First Method 
    }

    demo() {
        Count++; //Second Method
    }
}
public class countObject {
    public static void main(String[] args) {
        demo d1=new demo();
        demo d2=new demo();
        demo d3=new demo();
        demo d4=new demo();
        demo d5=new demo();
        demo d6=new demo();

        System.out.println("Number of Object : " +demo.count);
        System.out.println("Number of Object : " +demo.Count);
    }
}
