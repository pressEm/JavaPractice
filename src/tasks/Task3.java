package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 3, 2, 5, 5, 5, 3, 3, 3, 4, 5, 5, 5, 6};
        int[] arrSorted = {1, 1, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6};
        int[] res1 = removeDuplicatesSet(arr);
        int[] res2 = removeDuplicatesSorted(arrSorted);

        for (int i : res1
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : res2
        ) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeDuplicatesSet(int[] list) {
        SortedSet sortedSet = new TreeSet();
        for (int i : list) {
            sortedSet.add(i);
        }
        Object[] arr = sortedSet.toArray();
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = (int) arr[i];
        }
        return res;
    }

    public static int[] removeDuplicatesSorted(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0) || (arr[i] != arr[i - 1])) {
                res.add(arr[i]);
            }
        }
        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }

}
