package searchandsort.binsearch.third;

import java.util.Scanner;

public class BinarySearch {
    static Scanner input = new Scanner(System.in);

    static int[] readArray(int size) {
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        return a;
    }

    static boolean binSearch(int[] a, int element) {
        int right;
        int left;
        int middle;

        left = 0;
        right = a.length - 1;
        while (left < right) {
            middle = (left + right) / 2;
            if (a[middle] < element) left = middle + 1;
            else right = middle;
        }
        if (a[right] == element) return true;
        else return false;
    }

    public static void main(String[] args) {
        int nSize;
        int kSize;
        int[] firstArray;
        int[] secondArray;
        boolean[] isExist;
        boolean result;

        nSize = input.nextInt();
        kSize = input.nextInt();
        firstArray = new int[nSize];
        secondArray = new int[kSize];
        isExist = new boolean[secondArray.length];
        firstArray = readArray(firstArray.length);
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i]= input.nextInt();
            result = binSearch(firstArray, secondArray[i]);
            if (result) isExist[i] = result;
            else isExist[i] = result;
        }
        for (boolean x : isExist) {
            System.out.println(x ? "YES" : "NO");
        }
    }

}
