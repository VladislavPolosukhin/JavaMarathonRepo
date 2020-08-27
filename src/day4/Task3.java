package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int [] [] array = new int[12][8];
        int summ = 0;
        int index = 0;

        for (int i = 0; i < 12; i++) {
            int summOfj = 0;
            for (int j = 0; j < 8 ; j++) {
                array [i][j] = (int) (Math.random() * 51);
                summOfj = summOfj + array [i] [j];

            }

            if (summOfj > summ || summOfj == summ){
                summ = summOfj;
                index = i;
            }
        }

        System.out.println(index);

    }
}
