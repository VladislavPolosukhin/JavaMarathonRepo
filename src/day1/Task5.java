package day1;

public class Task5 {
    public static void main(String[] args) {
        int age = 1;
        String sign = "Мой возраст ";

        for (int i = 0; i < 20 ; i++) {
            if (age < 100){
                System.out.println(sign + age);
            }
            age = age + 5;
        }
    }

}
