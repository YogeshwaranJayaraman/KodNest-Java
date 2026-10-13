class Parent {
    void disp1() {
        System.out.println("Inside Parent disp 1");
    }
    void disp2() {
        System.out.println("Inside Parent disp 2");
    }
}
class Child extends Parent {
    @Override
    void disp2 () {
        System.out.println("Inside child disp 2"); //because method in the child will be updated 
    } 
     void disp3 () {
        System.out.println("Inside child disp 3");
    }
}
public class methodOverRiding {
    public static void main(String[] args) {
        Child c=new Child();
        c.disp1();
        c.disp2();
        c.disp3();

    }
}
