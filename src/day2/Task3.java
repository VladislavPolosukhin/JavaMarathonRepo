package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }

        while (a < b) {
            a++;
            if ((a % 5 == 0) &&(a % 10 > 0 )){
                System.out.println(a);
            }
        }
    }
}
