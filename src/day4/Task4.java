package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int summ = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }

        for (int i = 0; i < array.length - 2; i++) {
            int sumForThree = array[i];
            for (int j = i + 1; j < i + 3; j++) {
                sumForThree = sumForThree + array[j];
            }
            System.out.println("Sum is " + sumForThree);
            if (sumForThree > summ) {
                summ = sumForThree;
                index = i;
            }
        }

        System.out.println(summ);
        System.out.println(index);

    }
}
