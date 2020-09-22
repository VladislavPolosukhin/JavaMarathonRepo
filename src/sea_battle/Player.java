package sea_battle;

import java.util.Scanner;

public class Player {
    private String name;
    private final Field enemyField;
    private Field myField;

    public Player(String name, Field enemyField, Field myField) {
        this.name = name;
        this.enemyField = enemyField;
        this.myField = myField;
    }

    public Player(Field enemyField) {
        this.enemyField = enemyField;
    }

    public String getName() {
        return name;
    }

    public boolean shot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты выстрела (формат: x,y)");
        if (scanner.hasNext()) {

            String s = scanner.nextLine();
            if (s.equals("Показать поле")) {
                myField.showField();
            scanner = new Scanner(System.in);
            s = scanner.nextLine();
            }


                String[] coordinate =  s.split(",");
                int[][] shot = {{Integer.parseInt(coordinate[0]), Integer.parseInt(coordinate[1])}};
                return enemyField.putShot(shot, name);


        }
        return false;
    }
}


