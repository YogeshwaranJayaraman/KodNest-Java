import java.util.Scanner;
class unlock {
    void unlock(int pin) {
        System.out.println("Mobile Unlocked by Pin");
    }
    void unlock (String password) {
        System.out.println("Mobile unlocked by Password");
    }
    void unlock (Pattern p) {
        System.out.println("Mobile unlocked by pattern");
    }
    void unlock (Face f) {
        System.out.println("Mobile unlocked by FaceID");
    }
    void unlock (FingerPrint fp) {
        System.out.println("Mobile unlocked by FingerPrint");
    }
}
class Pattern {


}
class Face {

}
class FingerPrint {

}
;
public class MobileUnlock {
    public static void main(String[] args) {
        Scanner doc=new Scanner(System.in);
        System.out.println("Enter Pin: ");
        int pin=doc.nextInt();
        doc.nextLine();
        System.out.println("Enter Password: ");
        String password=doc.nextLine();
        unlock u=new unlock();
        u.unlock(pin);
        u.unlock(password);
        Pattern p=new Pattern();
        Face f=new Face();
        FingerPrint fp=new FingerPrint();
        u.unlock(p);
        u.unlock(f);
        u.unlock(fp);




    }
    
}
