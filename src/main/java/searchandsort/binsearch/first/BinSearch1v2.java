package searchandsort.binsearch.first;

import java.util.Random;
import java.util.Scanner;

public class BinSearch1v2 {
    static Scanner input = new Scanner(System.in);

    static int binSearch(int array[], int desiredItem) {
        int right;
        int left;
        int middle;

        left = 0;
        right = array.length - 1;
        while (left < right) {
            middle = (right + left) / 2;
            if (desiredItem > array[middle]) left = middle + 1;
            else right = middle;
        }
        return right;
    }



    public static void main(String[] args) {
        int n;
        int k;
        int[] arrayN;
        int[] arrayK;

        n = input.nextInt();
        arrayN = new int[n];
        k = input.nextInt();
        arrayK = new int[k];

        for (int i = 0; i < n; i++) arrayN[i] = input.nextInt();
        for (int i = 0; i < k; i++) arrayK[i] = input.nextInt();

    }
}
