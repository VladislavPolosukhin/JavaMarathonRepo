package day16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day16\\firstList.txt", StandardCharsets.UTF_8);
        PrintWriter writer2 = new PrintWriter("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day16\\secondList.txt", StandardCharsets.UTF_8);

        for (int i = 0; i < 1000; i++) {
           String s = ((int) (Math.random() * 101)) + " ";
            writer.print(s);
        }

        writer.close();

        File file = new File("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day16\\firstList.txt");
        Scanner scanner = new Scanner(file);

        String[] line = scanner.nextLine().split(" ");
        int sumOfTw = 0;
        int counter = 0;
        int length = line.length + 1;
        for (int i = 1; i < length; i++) {
            if (i % 20 == 0) {
                sumOfTw = sumOfTw + Integer.parseInt(line[i - 1]);
                counter++;
                writer2.print((double) sumOfTw / counter + " ");
                sumOfTw = 0;
                counter = 0;
            }

            sumOfTw = sumOfTw + Integer.parseInt(line[i - 1]);
            counter++;

        }

        writer2.close();

        File file2 = new File("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day16\\secondList.txt");
        Scanner scanner2 = new Scanner(file2);


        String [] lineOfDoubles = scanner2.nextLine().split(" ");
        double sum2 = 0.0;
        for (int i = 0; i < lineOfDoubles.length ; i++) {
            sum2 = sum2 + Double.parseDouble(lineOfDoubles[i]);
        }


        System.out.println((int) sum2);

    }
}
