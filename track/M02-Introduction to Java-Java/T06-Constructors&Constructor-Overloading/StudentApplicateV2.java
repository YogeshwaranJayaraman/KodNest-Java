 class Student {
    String name;
    int age;
    double height;
    //function will be called during the creation of the of the object
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

}
public class StudentApplicateV2 {
    public static void main(String [] args) {
        Student s1=new Student("Rani",19,4.5);
        s1.display();
        
    }
    
}