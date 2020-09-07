package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        long start;
        long finish;
        long period;

        start = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++) {
            str = str + i + " ";
        }

        finish = System.currentTimeMillis();
        period = finish - start;

        System.out.println("Time for concatenation (millis) is " + period);

        start = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(i).append(" ");
        }

        finish = System.currentTimeMillis();
        period = finish - start;


        System.out.println("Time for stringbuilder (millis) is " + period);

        System.out.println("-----------Task1 2 ----------");
        Airplane airplane = new Airplane(2000, 220, 70, "Xia yui hao");
        System.out.println(airplane);
    }
}
