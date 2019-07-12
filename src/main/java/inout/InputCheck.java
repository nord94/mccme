package inout;

import java.io.*;
import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args) {
        int n;
        int h;
        int w;
        PrintWriter pw;

        pw = new PrintWriter(System.out, true);
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла: " + exc);
        }
    }
}
