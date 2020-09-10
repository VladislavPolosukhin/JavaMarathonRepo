package day18;

public class Task2 {
    private static int counter = 0;

    public static void main(String[] args) {
        System.out.println(countSeven(61777123));
    }

    private static int countSeven(int number) {
        if (number < 10) {
            if (number == 7) {
                return counter++;
            }
            return counter;

        }
        if (number % 10 == 7) {
            counter++;
        }
        String s = String.valueOf(number);
        s = s.substring(0, s.length() - 1);
        countSeven(Integer.parseInt(s));
        return counter;
    }
}
