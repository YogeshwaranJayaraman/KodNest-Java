class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void sleep() {
        System.out.println("Animal is sleeping");
    }
} 
class Monkey extends Animal {
    void eat() {
        System.out.println("Monkey steals and eat");//while overriding child updates his own behavior 
    }
}
class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger hut and eat");//while overriding child updates his own behavior 
    }
}
public class understandingMethodOverRiding {
    public static void main(String[] args) {
        Monkey m=new Monkey();
        m.eat();
        m.sleep();
        Tiger t=new Tiger();
        t.eat();
        t.sleep();
    }
}
