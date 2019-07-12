package searchandsort.linsort.task07;

import java.util.Scanner;

public class Audit {
    static Scanner input = new Scanner(System.in);

    static int[] searchMin(int[] a) {
        int min;
        int exMin;
        int[] b = new int[2];
        min = a[0] < a[1] ? 0 : 1;
        exMin = min == 0 ? 1 : 0;
        for (int i = 2; i < a.length; i++) {
            if (a[i] < a[exMin]) {
                if (a[i] < a[min]) {
                    int j;
                    j = min;
                    min = i;
                    exMin = j;
                } else exMin = i;
            }
        }
        b[0] = min;
        b[1] = exMin;
        return b;
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        int min[];

        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) array[i] = input.nextInt();
        min = searchMin(array);
        System.out.printf("%d %d", array[min[0]], array[min[1]]);
    }
}
