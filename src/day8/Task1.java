package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        long startConcatenation;
        long startStringBuilder;
        long finishConcatenation;
        long finishStringBuilder;
        long periodForConcatenation;
        long periodForStringBuilder;

        startConcatenation = System.currentTimeMillis();
        for (int i = 0; i < 20001 ; i++) {
            str = str + i +" ";
        }
        finishConcatenation = System.currentTimeMillis();
        periodForConcatenation = finishConcatenation - startConcatenation;

        startStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < 20001 ; i++) {
            stringBuilder.append(i).append(" ");
        }
        finishStringBuilder = System.currentTimeMillis();
        periodForStringBuilder = finishStringBuilder - startStringBuilder;

        System.out.println("Time for concatenation (millis) is " + periodForConcatenation);
        System.out.println("Time for stringbuilder (millis) is " + periodForStringBuilder);

        System.out.println("-----------Task 2 ----------");
        Airplane airplane = new Airplane(2000,220,70,"Xia yui hao");
        System.out.println(airplane);
    }
}
