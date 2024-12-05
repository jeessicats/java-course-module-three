package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "cookie");
        cookies.put("email", "cookie@email.com");
        cookies.put("password", "milk");
        cookies.put("phone", "55 88776699");

        cookies.remove("phone");
        cookies.put("password", "milkshake");

        System.out.println("Contains 'password' key: ' " + cookies.containsKey("password"));
        System.out.println("Password: " + cookies.get("password"));
        System.out.println("Size of cookies: " + cookies.size());

        System.out.println("All cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
