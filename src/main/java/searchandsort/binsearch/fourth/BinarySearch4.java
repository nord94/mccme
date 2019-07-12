package searchandsort.binsearch.fourth;

import java.util.Scanner;

public class BinarySearch4 {
    static Scanner input = new Scanner(System.in);

    static int[] readArray(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        return a;
    }

    static int searchFirstEntry(int[] array, int element) {
        int right;
        int left;
        int middle;

        left = 0;
        right = array.length - 1;
        while (left < right) {
            middle = (left + right) / 2;
            if (array[middle] < element) left = middle + 1;
            else right = middle;
        }
        if (array[right] == element) return right;
        else return -1;
    }

    static int searchLastEntry(int[] array, int element) {
        int right;
        int left;
        int middle;

        left = 0;
        right = array.length - 1;
        while (right > left) {
            middle = (left + right) / 2;
            if (array[middle] < element) left = middle;
            else right = middle - 1;
        }
        if (array[right] == element) return left;
        else return 0;
    }

    public static void main(String[] args) {
        int n;
        int m;
        int[] sortedArray;
        int[] targetArray;
        int firstEntry;
        int secondEntry;

        n = input.nextInt();
        m = input.nextInt();
        sortedArray = new int[n];
        targetArray = new int[m];
        sortedArray = readArray(n);
        targetArray = readArray(m);
        for (int i = 0; i < targetArray.length; i++) {
            firstEntry = searchFirstEntry(sortedArray, targetArray[i]);
            secondEntry = searchLastEntry(sortedArray, targetArray[i]);
            System.out.printf("%d %d", sortedArray[firstEntry],
                    sortedArray[secondEntry]);
        }
    }
}
