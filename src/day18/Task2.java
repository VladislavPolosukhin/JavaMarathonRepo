package day18;

public class Task2 {
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println(countSeven(71777127));
    }

    private static int countSeven(int number) {

        if (number == 0)
        {
            return counter;
        }


        if (number % 10 == 7) {
            counter++;
        }

        countSeven(number / 10);
        return counter;
    }
}
