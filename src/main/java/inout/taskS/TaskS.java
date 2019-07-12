package inout.taskS;

import java.io.*;

interface ReadBoy {
    int myJob(int a, int b, int c);
}

public class TaskS {
    public static void main(String[] args) {
        int height;
        int daySpeed;
        int nightSpeed;
        String fileName;
        double result;

        ReadBoy readBoy;

        readBoy = (h, a, b) -> h / (a - b) + (h - a * (h / (a - b))) / a;

        fileName = "C:\\Users\\Volodia\\IdeaProjects\\mccme\\src\\main\\java\\inout\\taskS\\data1.txt";
        height = 0;
        daySpeed = 0;
        nightSpeed = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            height = Integer.parseInt(br.readLine());
            daySpeed = Integer.parseInt(br.readLine());
            nightSpeed = Integer.parseInt(br.readLine());
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении: " + exc.getClass());
        }

        result = ((height-daySpeed)/(daySpeed-nightSpeed));
        System.out.println(result);


    }
}
