package searchandsort.linsort.task05;

import java.util.Scanner;

public class MaxNum {
    static Scanner input = new Scanner(System.in);

    static int maxElementSearch(int[] a) {
        int max;
        max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        int key;

        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) array[i] = input.nextInt();
        System.out.println(maxElementSearch(array));
    }
}
