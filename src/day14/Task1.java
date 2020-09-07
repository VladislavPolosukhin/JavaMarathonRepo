package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        int sum = 0;

        File file = new File("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day14\\Test");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        String line = scanner.nextLine();
        String [] numbers = line.split(" ");
        if (numbers.length != 10){
            try {
                throw new ScannerException("Incorrect file");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        else {
            for (int i = 0; i < numbers.length ; i++) {
                sum = sum + Integer.parseInt(numbers[i]);
            }

            System.out.println("sum is " + sum);
        }


    }
}
