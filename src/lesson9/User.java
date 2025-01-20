package lesson9;

// Опишите класс User с одним полем name. Добавьте конструктор, сеттер и геттер.
// Создайте Map, в котором для каждого пользователя хранится количество очков, заработанных в какой-то игре (Map<User, Integer>).
// Напишите программу, которая считывает с консоли имя и показывает, сколько очков у такого пользователя.
// Сами данные можно добавить в Map при создании или сгенерировать случайно.

import java.util.*;

public class User {

    private String name;

    public User(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public static void main(String[] args) {
        List<String> realNames = Arrays.asList("Agafia", "Agafon", "Aguei", "Akoulina", "Alexander", "Alexey", "Anastasia", "Anatoly", "Andrey",
                "Anisy","Anna","Antonina","Anton","Arsenty", "Arkhip","Akim","Afanasy","Boris","Valerian","Valentin","Varvara","Viatcheslav","Victor",
                "Vitaly","Vladimir","Vlas","Gennady","Gavriil","Georgy","Gerasim","Gleb","Grigory","Daniil", "Daria","Dmitry","Denis","Evgeny","Evdokia");
        Set<String> names = new HashSet<>();
        Random random = new Random();

        while (names.size() < 10) {
            String randomName = realNames.get(random.nextInt(realNames.size()));
            names.add(randomName);
        }

        System.out.println("Доступные имена: " + names.toString());
        Map<User, Integer> userMap = getUserMap(names, 1999);
        showUserPoint(userMap);
    }

//    public static void main(String[] args) {
//
//        Set<String> names = getRandSet(10, 3, 7);
//        System.out.println("Доступные имена: " + names.toString());
//        Map<User, Integer> userMap = getUserMap (names, 1999);
//        showUserPoint(userMap);
//    }

    public static Map<User, Integer> getUserMap(Set<String> names, int maxPoints) {
        Map<User, Integer> userMap = new HashMap<>();

        for (String name : names) {
            int points = (int) (Math.random() * (maxPoints * 2 + 1) - maxPoints);
            userMap.put(new User(name), points);
        }

        return userMap;
    }

    public static Map<User, Integer> showUserPoint (Map<User, Integer> userMap) {
        System.out.println("Введите имя пользователя: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.nextLine();
            User thisUser = null;
            for (User user : userMap.keySet()) {
                if (user.getName().equals(name)) {
                    thisUser = user;
                    break;
                }
            }

            if (thisUser == null) {
                System.out.println("Данный пользователь не существует.");
            } else {
                System.out.println("У пользователя " + name + " - " + userMap.get(thisUser) + " очко(в).");
            }

            return userMap;
        }
    }

    public  static Set<String> getRandSet(int size, int minLen, int maxLen) {
        Set<String> randSet = new HashSet<>();
        char[] alphaNumeric = getAlphaNumeric();

        for (int i = 0; i < size; i++) {
            String element = "";
            int len = (int) (Math.random() * (maxLen - minLen + 1) + minLen);

            for (int j = 0; j < len; j++) {
                char newChar = alphaNumeric[(int) (Math.random() * alphaNumeric.length)];
                element = element + newChar;
            }

            randSet.add(element);
        }

        return randSet;
    }

    public static char[] getAlphaNumeric() {
        char[] alphaNumeric = new char[10 + 26 + 26];

        int index = 0;
        for (int i = (int) '0'; i <= (int) '9'; i++) {
            alphaNumeric[index++] = (char) i;
        }

        for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
            alphaNumeric[index++] = (char) i;
            alphaNumeric[index++] = (char) (i + 32);
        }

        return alphaNumeric;
    }
}
