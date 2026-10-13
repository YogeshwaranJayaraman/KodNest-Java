public class runtimePolymorphism {
    public static void main(String[] args) {
        JavaDeveloper jd=new JavaDeveloper();
        accessMethod(jd);
        PythonDeveloper pd=new PythonDeveloper();
        accessMethod(pd);
    }
    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();//upcasting 
    }
}
class Developer {
    void work() {
        System.out.println("Developer Working");
    }
    void project() {
        System.out.println("Developer Doing Project");
    }
}
class JavaDeveloper extends Developer {
    @Override 
    void work() {
        System.out.println("Java Developer Working");
    }
     @Override 
    void project() {
        System.out.println("Java Developer Doing Project");
    }
}
class PythonDeveloper extends Developer {
     @Override 
    void work() {
        System.out.println("Python Developer Working");
    }
     @Override 
    void project() {
        System.out.println("Python Developer Doing Project");
    }
}
