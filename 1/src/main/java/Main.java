import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Byte> map = new HashMap<>();

        for (byte i = 65; i <= 90; i++) {
            map.put((char) i, i);
        }

        System.out.println(map);

        map.forEach((letter, b) -> System.out.println(letter + " is " + b));

//        for (Character key : map.keySet()) {
//            System.out.print(key + " ");
//        }

        User u = new User();
        u.name = "name";

        f(u);
        System.out.println(u.name);
    }

    public static void f(User u) {
        u.name = "new name";
    }
}
