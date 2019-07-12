package searchandsort.linsort.task04;

import java.util.Scanner;

public class LinSearch4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        int[] array;
        int key;

        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) array[i] = input.nextInt();
        key = input.nextInt();

        for (int i =0;i<size;i++){
            if (array[i]==key) System.out.println(i+1);
        }
    }
}
