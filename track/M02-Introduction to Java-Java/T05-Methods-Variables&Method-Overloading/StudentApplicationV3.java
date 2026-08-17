class Student {
    String name;
    int age;
    double height;

    Student() {
        name ="Anu";
        age=20;
        height=5.0;
    }
    Student(String name) {
        this.name=name;
    }
    Student (String name,int age,double height) {
        this.name=name;
        this.age=age;
        this.height=height;

    }
    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }


}public class StudentApplicationV3 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        
    }
    
}
