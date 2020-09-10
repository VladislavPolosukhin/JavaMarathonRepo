package day18;

public class Task1 {
    static int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

    public static void main(String[] args) {
        System.out.println(summOfArray(numbers.length - 1));
    }

    public static int summOfArray(int position) {
        if (position == -1)
            return 0;

        return numbers[position] + summOfArray(--position);
    }
}
