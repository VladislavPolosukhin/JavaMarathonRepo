package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int stages = scanner.nextInt();
            if (stages > 0 && stages < 5){
                System.out.println("Малоэтажный дом");
            }
            else if (stages > 4 && stages < 9){
                System.out.println("Среднеэтажный дом");
            }
            else if (stages >= 9){
                System.out.println("Многоэтажный дом");
            }

            else {
                System.out.println("error");
            }
        }
    }
}
