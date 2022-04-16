
import java.util.*;

public class PhoneBook {
    private String group;
    private Map<String, List<Contact>> phoneBook = new HashMap<>();

    public String addContactToGroup(Contact contact, String group) {
        if (phoneBook.containsKey(group)) {
           if (phoneBook.get(group) == null) {
               List<Contact> contacts = new ArrayList<>();
               contacts.add(contact);
               phoneBook.put(group, contacts);
           } else {
               phoneBook.get(group).add(contact);
           }
            return "Контакт добавлен в группу";
        }
        return "Сначала надо создать группу";
    }

    public boolean setGroup(String group) {
        if (phoneBook.containsKey(group)) {
            return false;
        }
        phoneBook.put(group, new ArrayList<>());
        return true;
    }

    public String getGroupNames() {
        int i = 1;
        String names = "";
        for (Map.Entry<String, List<Contact>> kv : phoneBook.entrySet()) {
            names += i + ". " + kv.getKey() + " ";
            i++;
        }
        return names;
    }

    public String searchContactByGroup(String group) {
        if (phoneBook.containsKey(group)) {
            return group + " " + phoneBook.get(group);
        }
        return "Группы " + group + " не существует";
    }

    public String searchContactByPhone(String phone) {
        for (Map.Entry<String, List<Contact>> kv : phoneBook.entrySet()) {
            List <Contact> list = kv.getValue();
            for (int i = 0; i < list.size(); i++) {
                if (phone.equals(list.get(i).getPhoneNumber())) {
                    return "Владелец телефона номер " + phone + " - " +
                            list.get(i).getName() + " " + list.get(i).getSurname();
                }
            }
        }
        return "Контакта с телефоном " + phone + " не существует";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneBook phoneBook = (PhoneBook) o;
        return group.equals(phoneBook.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }
}
