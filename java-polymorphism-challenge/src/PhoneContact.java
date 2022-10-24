import java.util.ArrayList;
import java.util.List;

public class PhoneContact {
    private String name;
    private Phone phoneNumber;
    private String email;


    public PhoneContact(String name, Phone phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public PhoneContact(String name, Phone phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PhoneContact(String name, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneContact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
