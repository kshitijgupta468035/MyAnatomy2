package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class MyAnatomy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer s : set) {
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (list.get(i) == arr[j]) {
                    c = c + 1;
                }
            }
            if (c == 1) {
                System.out.println(list.get(i));
            }
        }

    }
}
