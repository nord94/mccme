package searchandsort.binsearch.second;

import java.util.Scanner;

public class BinSearchComplexity {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        int number;
        int right;
        int remainder;

        right = input.nextInt();
        remainder = right % 2 == 0 ? 0 : 1;
        number = 0;
        while (right > 1) {
            right /= 2;
            number++;
        }
        System.out.println(number + remainder);
    }
}
