import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] array;
        int key;
        int diff;
        int min;
        n= input.nextInt();
        array = new int[n];
        for (int i=0;i<n;i++){
            array[i]= input.nextInt();
        }
        key = input.nextInt();
        diff = Math.abs(array[0]-key);
        min=0;
        for (int i: array){
            if (diff>Math.abs(i-key)) min =i;
        }
        System.out.println(min);
    }
}