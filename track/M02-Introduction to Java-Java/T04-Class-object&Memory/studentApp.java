class student {
    String name;
    int age; 
    double height;

    void input(String name,int age,double height) {
        this.name=name;
        this.age=age;
        this.height=height;
        
    }
    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);

    }
}
public class studentApp{
    public static void main(String [] args) {
        student s1=new student();
        s1.input("Raja",20,5.5);
        s1.display();
    }
}