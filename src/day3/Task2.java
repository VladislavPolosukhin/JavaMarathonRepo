package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        boolean check = true;

        while (check) {

            Scanner scanner = new Scanner(System.in);
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b == 0){
                break;
            }
            System.out.println(a/b);
        }
    }
}
