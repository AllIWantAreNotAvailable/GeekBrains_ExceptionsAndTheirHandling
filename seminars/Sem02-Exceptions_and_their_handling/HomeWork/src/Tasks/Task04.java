package Tasks;

public class Task04 {

    public static String expr(char a) throws Exception {

        if (Character.isWhitespace(a)) {
            throw new Exception("Пустая строка введена.");
        }

        return String.format("Ваш ввод - %c", a);
    }

}
