package lesson5;

// Написать метод, который проверяет является ли слово палиндромом.

public class WordPalindrome {

    public static void main(String[] args) {
        String word = "РотОР";
        if (isPalindrome(word)) {
            System.out.println(word + " - слово палиндром.");
        } else {
            System.out.println("слово: " + word + " - не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}