package module8.HomeWork1;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {

    private HashMap<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        String[] components = data.split("\\s+");
        if(components.length != 4){
            throw new IllegalArgumentException("Wrong format");
        }
        String phoneNumber = components[3];
        if(phoneNumber.length() != 12 || phoneNumber.charAt(0) != '+' || phoneNumber.charAt(1) != '7'){
            throw new IllegalArgumentException("Wrong phone number format");
        }

        String email = components[2];
        Pattern p1 = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
        Matcher m1 = p1.matcher(email);
        if(!m1.matches()){
            throw new IllegalArgumentException("Wrong email format");
        }

        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        String[] nameWords = name.split(" ");
        if(nameWords.length != 2){
            throw new IllegalArgumentException("Wrong command format");
        }
        storage.remove(name);
    }

    public int getCount() {
        return storage.size();
    }
}