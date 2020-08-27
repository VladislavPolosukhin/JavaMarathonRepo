package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int minimum;
        int maximum;
        int elementWithZero = 0;
        int sumElementsWthZero = 0;


        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }

        minimum = array[0];
        maximum = array[0];

        for (int arrayElement : array){
            if (arrayElement < minimum){
                minimum = arrayElement;
            }
            if (arrayElement > maximum){
                maximum = arrayElement;
            }

            if (arrayElement % 10 == 0){
                elementWithZero++;
                sumElementsWthZero = sumElementsWthZero + arrayElement;
            }

        }

        System.out.println("Минимальное значение массива: " + minimum + "\n" +
                "Максимальное значение массива: " + maximum + "\n" +
                "Количество оканчивающихся на 10: " + elementWithZero + "\n" +
                "Сумма чисел оканчивающихся на 10: " + sumElementsWthZero);

    }
}
