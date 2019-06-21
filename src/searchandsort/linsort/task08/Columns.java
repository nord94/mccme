package searchandsort.linsort.task08;

import java.util.Scanner;

public class Columns {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        int size;
        int[][] a;
        int key;
        String[] yesOrNo;

        key = input.nextInt();
        size = input.nextInt();
        yesOrNo = new String[size];
        for (int i = 0; i < size; i++) yesOrNo[i] = "NO";
        a = new int[size][size];

        for (int j = 0; j < size; j++) {
            for (int k = 0; k < size; k++) {
                a[j][k] = input.nextInt();
                if ((a[j][k] == key) & (yesOrNo[k] != "YES")) yesOrNo[k] = "YES";
            }
        }
        for (int i = 0; i < size; i++) System.out.println(yesOrNo[i]);;
    }
}
