package searchandsort.binsearch.first;

import java.util.Scanner;

public class BinSearch1 {
    static Scanner input = new Scanner(System.in);

    static int[] readValues(int size) {
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }
        return a;
    }

    static int binSearch(int[] a, int b) {
        int left;
        int right;
        int middle;

        left = 0;
        right = a.length;

        while (left < right) {
            middle = (left + right) / 2;
            if (a[middle] - b < 0) left = middle + 1;
            else right = middle;
        }
        return right;
    }

    public static void main(String[] args) {
        int n;
        int k;
        int[] firstArray;
        int[] secondArray;
        int closest;
        int diff1;
        int diff2;

        diff2=0;
        n = input.nextInt();
        k = input.nextInt();
        firstArray = readValues(n);
        secondArray = readValues(k);
        closest = 0;
        for (int i = 0; i < secondArray.length; i++) {
            closest = firstArray[binSearch(firstArray, secondArray[i])];
            diff1=secondArray[i]-closest;
            if (i>0) diff2 = secondArray[i]-firstArray[binSearch(firstArray, secondArray[i])-1];
            if (diff1==diff2){
                System.out.println(firstArray[binSearch(firstArray, secondArray[i])-1]);
            }
        }

    }
}
