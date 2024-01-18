package tasks;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(validate("{[({(())})]}"));
    }

    public static boolean validate(String string) {
        char[] arr = new char[string.length()];
        arr = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || !isCouple(stack.peek(), arr[i])) {
                stack.push(arr[i]);
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else return false;
    }
    public static boolean isCouple(char a, char b) {
        if (((a == '(') && (b == ')')) ||
                ((a == '{') && (b == '}')) ||
                ((a == '[') && (b == ']'))) {
            return true;
        }
        return false;
    }
}
