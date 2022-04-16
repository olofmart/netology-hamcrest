
import java.util.Objects;

public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;

    public Contact() {
        this.name = "";
        this.surname = "";
        this.phoneNumber = "";
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.surname = "";
        this.phoneNumber = phoneNumber;
    }
    public Contact(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return phoneNumber.equals(contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "Контакт: " + name + " " + surname + " - " + phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
