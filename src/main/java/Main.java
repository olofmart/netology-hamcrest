
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static List <Contact> myContacts = new ArrayList<>();
    public static PhoneBook myPhoneBook = new PhoneBook();

    public static void main(String[] args) {
        fillListContacts();

        myPhoneBook.setGroup("Семья");
        myPhoneBook.setGroup("Друзья");
        myPhoneBook.setGroup("Коллеги");
        System.out.println("\nСоздали три группы: " + myPhoneBook.getGroupNames());

        myPhoneBook.addContactToGroup(myContacts.get(0), "Семья");
        myPhoneBook.addContactToGroup(myContacts.get(3), "Семья");
        myPhoneBook.addContactToGroup(myContacts.get(0), "Коллеги");
        myPhoneBook.addContactToGroup(myContacts.get(4), "Коллеги");
        myPhoneBook.addContactToGroup(myContacts.get(0), "Друзья");
        myPhoneBook.addContactToGroup(myContacts.get(2), "Друзья");

        System.out.println("\nЗаполнили три группы");
        System.out.println(myPhoneBook.searchContactByGroup("Семья"));
        System.out.println(myPhoneBook.searchContactByGroup("Коллеги"));
        System.out.println(myPhoneBook.searchContactByGroup("Друзья"));
        System.out.println();
        System.out.println(myPhoneBook.searchContactByGroup("Нетология"));


        myPhoneBook.setGroup("Нетология");
        myPhoneBook.addContactToGroup(myContacts.get(0), "Нетология");
        myPhoneBook.addContactToGroup(myContacts.get(1), "Нетология");
        myPhoneBook.addContactToGroup(myContacts.get(2), "Нетология");
        System.out.println("\nСоздали и заполнили четвертую группу: " + myPhoneBook.searchContactByGroup("Нетология"));

        System.out.println("\nИщем владельца по номеру телефона");
        System.out.println(myPhoneBook.searchContactByPhone("+7-963-999-88-77"));
        System.out.println(myPhoneBook.searchContactByPhone("+7-903-111-22-34"));
    }

    public static void fillListContacts() {
        myContacts.addAll(asList(
                new Contact("Oleg", "M.", "+7-903-111-22-33"),
                new Contact("Filipp", "V.", "+7-963-999-88-77"),
                new Contact("Buratino", "+380-111-11-22"),
                new Contact("Ksu", "M.", "+7-909-111-00-00"),
                new Contact("Boss", "+7-999-999-99-99")));
    }
}
