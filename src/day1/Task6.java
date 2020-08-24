package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 1 +(int) (Math.random() * 9);
        for (int i = 1; i <10 ; i++) {
            System.out.println(i + " x " + k + " = " + (i*k));
        }

    }
}
