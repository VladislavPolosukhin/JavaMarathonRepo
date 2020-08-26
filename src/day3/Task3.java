package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double a;
        double b;

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextDouble();
            b = scanner.nextDouble();

             if (b != 0){
                 System.out.println(a/b);
                 continue;
             }

            System.out.println("Деление на 0");

        }
    }
}
