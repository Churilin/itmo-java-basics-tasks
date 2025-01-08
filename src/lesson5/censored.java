package lesson5;

// Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».

public class censored {

    public static void main(String[] args) {
        String text = "Встретились Бяка и Бука.\n" +
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
        System.out.println(text);
        censored(text, "бяка");
    }

    public static void censored(String text, String censWord) {
        if (text == null) {
            throw new IllegalArgumentException("Пустой текст");
        }

        text = text.toLowerCase();

        text = text.replaceAll(censWord, "[вырезано цензурой]");
        System.out.println(text);
    }
}
