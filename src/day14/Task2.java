package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    private static List<String> datas = new LinkedList<>();

    public static void main(String[] args) {
        datas = parseFileToStringList();
        for (String s: datas){
            System.out.println(s);
        }
    }

    public static List<String> parseFileToStringList() {
        List<String> list = new LinkedList<>();

        File file = new File("C:\\Users\\Vladislav\\IdeaProjects\\JavaMarathon2020\\src\\day14\\people");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        while (scanner.hasNext()) {
            String[] k = scanner.nextLine().split(" ");
            int a = Integer.parseInt(k[1]);
            if (a < 0){
                try {
                    throw new ScannerException("Incorrect file");
                } catch (ScannerException e) {
                    e.printStackTrace();
                    break;
                }
            }

            list.add(k[0] + " " + k[1]);

        }

        return list;
    }

}
