package searchandsort.linsort.task06;

import java.util.Scanner;

public class MaxElementIndex {
    static Scanner input = new Scanner(System.in);
    static int maxIndex(int[] a){
        int index =0;
        for (int i =0;i<a.length;i++){
            if (a[i]>a[index]) index=i;
        }
        return index;
    }

    public static void main(String[] args) {
        int size;
        int[] array;

        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) array[i] = input.nextInt();
        System.out.println(maxIndex(array)+1);
    }
}
