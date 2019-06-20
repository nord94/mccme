package searchandsort.linsort.task02;

import java.util.Scanner;

public class LinSearch2 {
    boolean isHere(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int j=0;j<n;j++){
            array[j]= input.nextInt();
        }
        int key1
    }
}
