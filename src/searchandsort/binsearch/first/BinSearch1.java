package searchandsort.binsearch.first;

import java.util.Scanner;

public class BinSearch1 {
    static Scanner input = new Scanner(System.in);

    static int[] readValues(int size) {
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    static int binSearch(int[] array, int index) {
        int left;
        int right;
        int middle;

        left = 0;
        right = array.length;

        while (left < right) {
            middle = (left + right) / 2;
            if (array[middle] - index < 0) left = middle + 1;
            else right = middle;
        }
        return right;
    }

    public static void main(String[] args) {
        int n;
        int k;
        int[] firstArray;
        int[] secondArray;
        int rightClosest;
        int leftClosest;
        int rightDiff;
        int leftDiff;

        n = input.nextInt();
        k = input.nextInt();
        firstArray = readValues(n);
        secondArray = readValues(k);
        rightClosest = 0;
        leftClosest = 0;
        for (int i = 0; i < secondArray.length; i++) {
            rightClosest = binSearch(firstArray, secondArray[i]);
            leftClosest = rightClosest - 1;
            rightDiff = Math.abs(secondArray[i] - firstArray[rightClosest]);
            if (rightClosest > 0) leftDiff = Math.abs(secondArray[i] - firstArray[leftClosest]);
            else leftDiff = -1;
            if (leftDiff == rightDiff) {
                System.out.println(firstArray[leftClosest]);
            } else System.out.println(firstArray[rightClosest]);
        }
    }
}
