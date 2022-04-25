
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PhoneBookTest {

    @BeforeAll
    public static void preTest() {
        System.out.println("Tests started");
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Test start");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete");
    }

    @Test
    public void testListObject() {

        PhoneBook sut = new PhoneBook();;
        List<Contact> myContacts = new ArrayList<>();
        myContacts.addAll(asList(
                new Contact("Oleg", "M.", "+7-903-111-22-33"),
                new Contact("Filipp", "V.", "+7-963-999-88-77"),
                new Contact("Buratino", "+380-111-11-22"),
                new Contact("Ksu", "M.", "+7-909-111-00-00"),
                new Contact("Boss", "+7-999-999-99-99")));
        sut.setGroup("Семья");
        sut.setGroup("Друзья");
        sut.setGroup("Коллеги");

        assertThat(myContacts, is(not(empty())));
        assertThat(myContacts, hasSize(5));
        assertThat(sut, isA(PhoneBook.class));
        assertThat(myContacts.get(0), isA(Contact.class));
    }

    @Test
    public void testAddContactToGroup() {
        PhoneBook sut = new PhoneBook();;
        List<Contact> myContacts = new ArrayList<>();
        myContacts.addAll(asList(
                new Contact("Oleg", "M.", "+7-903-111-22-33"),
                new Contact("Filipp", "V.", "+7-963-999-88-77"),
                new Contact("Buratino", "+380-111-11-22"),
                new Contact("Ksu", "M.", "+7-909-111-00-00"),
                new Contact("Boss", "+7-999-999-99-99")));
        sut.setGroup("Семья");
        sut.setGroup("Друзья");
        sut.setGroup("Коллеги");

        String s1 = "Курсы", s2 = "Коллеги";
        Contact x = new Contact("Netology", "+7-499-333-22-11");

        String result1 = sut.addContactToGroup(x, s1);
        String result2 = sut.addContactToGroup(x, s2);


        assertThat(result1, equalTo("Сначала надо создать группу"));
        assertThat(result2, equalTo("Контакт добавлен в группу"));
    }

    @Test
    public void testSetGroup () {
        PhoneBook sut = new PhoneBook();;
        List<Contact> myContacts = new ArrayList<>();
        myContacts.addAll(asList(
                new Contact("Oleg", "M.", "+7-903-111-22-33"),
                new Contact("Filipp", "V.", "+7-963-999-88-77"),
                new Contact("Buratino", "+380-111-11-22"),
                new Contact("Ksu", "M.", "+7-909-111-00-00"),
                new Contact("Boss", "+7-999-999-99-99")));
        sut.setGroup("Семья");
        sut.setGroup("Друзья");
        sut.setGroup("Коллеги");

        String s1 = "Курсы";

        boolean b = sut.setGroup(s1);

        assertThat(b, is(true));
    }

}
