package lesson5;

// Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.

public class WordInverter {
    public static void main(String[] args) {
        String inputString = "This is a test string";
        System.out.println("The given string is: " + inputString + "\n"
                + "The string reversed word by word is:" + "\n" + reverseWords(inputString));
    }

    public static String reverseWords(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder invertedString = new StringBuilder();

        for (String word : words) {
            StringBuilder invertedWord = new StringBuilder(word);
            invertedString.append(invertedWord.reverse()).append(" ");
        }

        return invertedString.toString();
    }
}
