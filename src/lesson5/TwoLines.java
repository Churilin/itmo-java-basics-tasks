package lesson5;

// Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.

public class TwoLines {

    public static void main(String[] args) {
        String mainStr = "Наши поезда — самые поездатые поезда в мире, " +
                "и даже самые поездатые поезда не перепоездят наши поезда по поездатости.";
        String subStr = "поезд";

        int occurrences = getNumberOfOcc(mainStr, subStr);

        System.out.println("В этой строке: " + mainStr);
        System.out.println("Количество вхождений подстроки: " + "\"" + subStr + "\" " + "- "  + occurrences);
    }

    public static int getNumberOfOcc(String mainStr, String subStr) {
        if (mainStr.length() < subStr.length()) {
            System.out.println("Строка mainStr должна быть не меньше subStr!");
            return 0;
        }

        mainStr = mainStr.toLowerCase();
        subStr = subStr.toLowerCase();

        int number = 0;
        int index = -1;

        while (index < mainStr.length()) {
            if (mainStr.indexOf(subStr, index + 1) < 0) {
                return number;
            } else {
                number++;
                index = mainStr.indexOf(subStr, index + 1);
            }
        }

        return number;
    }
}
