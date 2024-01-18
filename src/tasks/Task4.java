package tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String[] emailsList = {"test@mail.ru", "123-kkdf@gmail.com", "123@343.com", "qwerty@.com", "123123@yandex.com", "test.test@gmail.com", "sdfsdfs@gmail."};
        validate(emailsList);
    }

    public static boolean validate(String[] emailList) {
        for (String text : emailList
        ) {
            Pattern pattern = Pattern.compile("^[a-zA-Z0]+[a-zA-Z0-9_.-]*@[A-Za-z0-9.]+(\\.[a-zA-Z]{2,})$");
            Matcher matcher = pattern.matcher(text);
            System.out.println(text + ": " + matcher.find());
        }
        return true;
    }
}
