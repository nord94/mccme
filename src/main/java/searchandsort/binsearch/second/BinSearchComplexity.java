package searchandsort.binsearch.second;

import java.util.Scanner;

public class BinSearchComplexity {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        int number;
        double calculatedNumber;
        int n;

        number = input.nextInt();
        n = 1;
        while (Math.pow(2, n) < number) n++;
        System.out.println(n);
    }
}
