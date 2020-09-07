package day15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day15\\shoes.csv");
        Scanner scanner = new Scanner(file);

        PrintWriter writer = new PrintWriter("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day15\\shoes.txt", StandardCharsets.UTF_8);
        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(";");
            int a = Integer.parseInt(strings[2]);
            String line;
            if (a == 0) {
                line = strings[0] + ", " + strings[1] + ", " + strings[2];
                writer.println(line);
            }

        }

        writer.close();
    }
}
