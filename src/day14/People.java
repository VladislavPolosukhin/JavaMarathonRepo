package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<People> parseFileToObject() {
        List<People> list = new LinkedList<>();

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
            if (a < 0) {
                try {
                    throw new ScannerException("Incorrect file");
                } catch (ScannerException e) {
                    e.printStackTrace();
                    break;
                }
            }
            list.add(new People(k[0], a));

        }

        return list;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", year = " + age;
    }

}
