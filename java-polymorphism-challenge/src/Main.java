import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneContact phoneContact1 = new PhoneContact("Eiji", new Phone("098584653"),"eiji@email.com");
        PhoneContact phoneContact2 = new PhoneContact("Ash", new Phone("43234567890"), "ash@emaul.com");
        PhoneContact phoneContact3 = new PhoneContact("lala", "lala@remail.vom");

        System.out.println(phoneContact1);
        System.out.println(phoneContact2);
        System.out.println(phoneContact3);

    }
}
