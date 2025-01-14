package lesson5;

// Написать метод для поиска самого длинного слова в тексте.

public class LongWord {

    public static void main(String[] args) {
        String text = "Разнообразный и богатый опыт говорит нам, " +
                "что укрепление и развитие внутренней структуры предоставляет широкие возможности для системы обучения кадров, " +
                "соответствующей насущным потребностям.";
        String longestWord = longestWord(text);
        System.out.println("Самое длинное слово в тексте - это: " + longestWord);
    }

    public static String longestWord(String text) {
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
