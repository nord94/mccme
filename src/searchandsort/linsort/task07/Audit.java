package searchandsort.linsort.task07;

import java.util.Scanner;

public class Audit {
    static Scanner input = new Scanner(System.in);
    static int searchMin(int[] a){
        int min;
        min =0;

        for (int i=0;i<a.length;i++){
            if (a[i]<a[min]) min=i;
        }
        return min;
    }
    static int searchExMin(int[] a, int min){
        int exMin;
        exMin = 0;
        for (int i=0;i<a.length;i++){
            if ((a[i]<a[exMin])&(a[i]!=a[min])) exMin=i;
        }
        return exMin;
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        int min;

        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) array[i] = input.nextInt();
        min=searchMin(array);
        System.out.printf("%d %d", array[min], array[searchExMin(array, array[min])]);
    }
}
