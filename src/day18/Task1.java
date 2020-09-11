package day18;

public class Task1 {


    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(summOfArray( numbers,numbers.length - 1));
    }

    public static int summOfArray(int [] numbers ,int position) {
        if (position == -1)
            return 0;

        return numbers[position] + summOfArray(numbers,--position);
    }
}
