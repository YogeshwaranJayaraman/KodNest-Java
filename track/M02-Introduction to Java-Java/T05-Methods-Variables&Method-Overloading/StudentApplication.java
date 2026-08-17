class Student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }
    void sleep() {
        System.out.println("Sleeping");
    }
}
public class StudentApplication {
    public static void main(String [] args) {
        Student s1=new Student();
        s1.roll=126;
        s1.name="Dinesh";
        s1.height=6.5;

        
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();



    }
    
}
