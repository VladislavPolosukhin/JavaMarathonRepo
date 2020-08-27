package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int biggerThanEight = 0;
        int equalsToOne = 0;
        int even = 0;
        int odd = 0;
        int summ = 0;

        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 11);
            if (array[i] > 8){
                biggerThanEight++;
            }
            if (array[i] == 1){
                equalsToOne++;
            }

            if (array [i] % 2 == 0){
                even++;
            }
            else {
                odd++;
            }

            summ = summ + array[i];
        }


        System.out.println("Длина массива: " + array.length + "\n" +
                "Количество чисел больше 8: " + biggerThanEight + "\n" +
                "Количество чисел равных 1: " + equalsToOne + "\n" +
                "Количество четных чисел: " + even + "\n" +
                "Количество нечетных чисел: " + odd + "\n" +
                "Сумма всех элементов массива: " + summ);
    }
}
