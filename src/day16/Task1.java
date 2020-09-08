package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    private static int sum = 0;
    private static int count = 0;

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day16\\Test");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextInt()){
            sum = sum + scanner.nextInt();
            count++;
        }
        double d = ((double) sum / count);
        System.out.println(d);
        System.out.println(new DecimalFormat("#0.00").format(d));
    }
}
