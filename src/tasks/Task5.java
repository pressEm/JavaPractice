package tasks;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(countCharAtWord('a', "AligatoraA"));
    }

    public static int countCharAtWord(char c, String s){
        char[] arr = s.toLowerCase().toCharArray();
        Character.toLowerCase(c);
        int count = 0;
        for (char cc:arr) {
            if (cc==c){
                count++;
            }
        }
        return count;
    }
}
