package searchandsort.linsort.task01;

import java.util.Scanner;

public class LinSearch1 {
    static int linSearch (int[] a, int k){
        int num =0;
        for (int i =0; i<a.length;i++){
            if (a[i]==k) num++;
        }
    return num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0;
        n=input.nextInt();
        int[] arr = new int[n];
        int key;
        for (int j=0;j<n;j++) {
            arr[j]=input.nextInt();
        }
        key = input.nextInt();
        System.out.println(linSearch(arr, key));
    }
}
