package lesson5;

 // Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

public class Censored {

    private static final String censored = "[вырезано цензурой]";

    public static void main(String[] args) {
        String str = "Встретились Бяка и Бука.\n" +
                "Никто не издал ни звука.\n" +
                "Никто не подал и знака —\n" +
                "Молчали Бука и Бяка.\n" +
                "\n" +
                "И Бука\n" +
                "Думал со скукой:\n" +
                "«Чего он так смотрит — букой?»\n" +
                "А Бяка думал:\n" +
                "«Однако\n" +
                "Какой он ужасный\n" +
                "Бяка…»";
        System.out.println(censorReplace(str, "бяка"));
    }

    public static String censorReplace(String text,  String badWord) {
        char[] badWordLower = badWord.toLowerCase().toCharArray();
        char[] badWordUpper = badWord.toUpperCase().toCharArray();
        String regEx = "\\b";
        for (int i = 0; i < badWordLower.length; i++) {
            regEx += "[" + badWordLower[i] + badWordUpper[i] + "]";
        }
        regEx += "([А-Яа-я]{0,3})\\b";
        text = text.replaceAll(regEx, censored);
        return text;
    }
}