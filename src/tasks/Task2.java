package tasks;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(myReverse("rft12345"));
    }
    public static String myReverse(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            char temp = arr[len-i-1];
            arr[len-i-1] = arr[i];
            arr[i] = temp;
        }
        return String.valueOf(arr);
    }
}
