package sea_battle;

import sea_battle.ships.Ships;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Field {

    private final GameOver gameOver;
    private final String[][] field = new String[10][10];
    private final List<Ships> shipsList = new LinkedList<Ships>();

    public Field(GameOver gameOver) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = "⬜";
            }
        }
        this.gameOver = gameOver;
    }

    public void showField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private boolean isAPartofEmptyArea(int x, int y) {
        return !field[x][y].equals("\uD83D\uDFE6") && !field[x][y].equals("\uD83D\uDEE5");
    }

    private void putEmptyArea(int x, int y) {

        for (int i = 0; i < 3; i++) {
            if (0 <= (x - 1) && (x - 1) <= 9 && 0 <= (y - 1 + i) && (y - 1 + i) <= 9) {
                field[x - 1][y - 1 + i] = "\uD83D\uDFE6";
            }
            if (0 <= (x) && (x) <= 9 && 0 <= (y - 1 + i) && (y - 1 + i) <= 9) {
                field[x][y - 1 + i] = "\uD83D\uDFE6";
            }
            if (0 <= (x + 1) && (x + 1) <= 9 && 0 <= (y - 1 + i) && (y - 1 + i) <= 9) {
                field[x + 1][y - 1 + i] = "\uD83D\uDFE6";
            }

        }
    }

    public void putShips() {

        putFourDeckShip();
        putThreeDecksShip();
        putTwoDeckShips();
        puOneDeckShips();

    }

    public boolean putShot(int[][] shot, String name) {
        if (field[shot[0][0]][shot[0][1]].equals("\uD83D\uDEE5")) {
            field[shot[0][0]][shot[0][1]] = " \uD83D\uDFE5";

            for (Ships ships : shipsList) {
                int[][] cordinatesOfTheDeck = ships.getCordinatesOfTheDeck();

                for (int i = 0; i < cordinatesOfTheDeck.length; i++) {

                    if (Arrays.equals(cordinatesOfTheDeck[i], (shot[0]))) {
                        ships.getDamage(name);
                    }
                }

            }
            return true;
        } else {
            System.out.println("Мимо");
        }
        return false;
    }


    private void puOneDeckShips() {
        for (int p = 0; p < 1; p++) {
            boolean isAgain = true;
            while (isAgain) {

                Scanner scanner = new Scanner(System.in);
                String s = "";
                switch (p) {
                    case 0:
                        s = "первого";
                        break;
                    case 1:
                        s = "второго";
                        break;
                    case 2:
                        s = "третьего";
                        break;
                    case 3:
                        s = "четвертого";
                        break;
                }
                System.out.println("Введите координаты " + s + " однопалубного корабля (формат: x,y)");
                if (scanner.hasNext()) {
                    String[] line = scanner.nextLine().split(",");

                    int lineX = 0;
                    int lineY = 0;

                    try {
                        lineX = Integer.parseInt(line[0]);
                        lineY = Integer.parseInt(line[1]);

                    } catch (Exception e) {
                        System.out.println("Ошибка, повторите ввод всех однопалубных кораблей");
                        puOneDeckShips();
                    }


                    if ((0 <= lineX && lineX <= 9) && (0 <= lineY && lineY <= 9)) {
                        if ((isAPartofEmptyArea(lineX, lineY))) {

                            putEmptyArea(lineX, lineY);
                            field[lineX][lineY] = "\uD83D\uDEE5";

                            showField();

                            int[][] myArr = {{lineX, lineY}};

                            shipsList.add(new Ships(1, gameOver, "Однопалубник", myArr));

                            isAgain = false;
                        } else
                            System.out.println("В плотную к другому кораблю. \nНеверные координаты, попробуйте снова");
                    } else System.out.println("Неверные координаты, попробуйте снова");
                }

            }
        }

    }

    private void putTwoDeckShips() {
        for (int k = 0; k < 2; k++) {
            boolean isAgain = true;
            while (isAgain) {

                Scanner scanner = new Scanner(System.in);
                String s = "";
                switch (k) {
                    case 0:
                        s = "первого";
                        break;
                    case 1:
                        s = "второго";
                        break;
                    case 2:
                        s = "третьего";
                        break;
                }
                System.out.println("Введите координаты " + s + " двухпалубного корабля (формат: x,y; x,y)");
                if (scanner.hasNext()) {
                    String[] line = scanner.nextLine().split(";");

                    int[] lineX = new int[2];
                    int[] lineY = new int[2];


                    for (int i = 0; i < line.length; i++) {
                        try {
                            String[] coordinate = line[i].split(",");
                            lineX[i] = Integer.parseInt(coordinate[0]);
                            lineY[i] = Integer.parseInt(coordinate[1]);
                        } catch (Exception e) {
                            System.out.println("Ошибка, повторите ввод всех двухпалубных кораблей");
                            putTwoDeckShips();
                        }

                    }

                    Arrays.sort(lineX);
                    Arrays.sort(lineY);

                    if ((0 <= lineX[0] && lineX[1] <= 9) && (0 <= lineY[0] && lineY[1] <= 9) && (lineX[1] - lineX[0] == 1) || (lineY[1] - lineY[0] == 1)) {
                        if ((isAPartofEmptyArea(lineX[0], lineY[0])) && (isAPartofEmptyArea(lineX[1], lineY[1]))) {

                            for (int i = 0; i < line.length; i++) {
                                putEmptyArea(lineX[i], lineY[i]);
                            }

                            for (int i = 0; i < line.length; i++) {
                                field[lineX[i]][lineY[i]] = "\uD83D\uDEE5";
                            }
                            showField();

                            int[][] myArr = {{lineX[0], lineY[0]}, {lineX[1], lineY[1]}};

                            shipsList.add(new Ships(2, gameOver, "Двухпалубник", myArr));

                            isAgain = false;
                        } else
                            System.out.println("В плотную к другому кораблю. \nНеверные координаты, попробуйте снова");
                    } else System.out.println("Неверные координаты, попробуйте снова");
                }

            }
        }
    }

    private void putThreeDecksShip() {
        for (int j = 0; j < 2; j++) {
            boolean isAgain = true;
            while (isAgain) {

                Scanner scanner = new Scanner(System.in);
                String s = "";
                switch (j) {
                    case 0:
                        s = "первого";
                        break;
                    case 1:
                        s = "второго";
                        break;
                }
                System.out.println("Введите координаты " + s + " трехпалубного корабля (формат: x,y; x,y; x,y)");
                if (scanner.hasNext()) {
                    String[] line = scanner.nextLine().split(";");

                    int[] lineX = new int[3];
                    int[] lineY = new int[3];

                    for (int i = 0; i < line.length; i++) {
                        try {
                            String[] coordinate = line[i].split(",");
                            lineX[i] = Integer.parseInt(coordinate[0]);
                            lineY[i] = Integer.parseInt(coordinate[1]);
                        } catch (Exception e) {
                            System.out.println("Ошибка, повторите ввод всех трехпалубных кораблей");
                            putThreeDecksShip();
                        }

                    }

                    Arrays.sort(lineX);
                    Arrays.sort(lineY);

                    if ((0 <= lineX[0]) && (lineX[2] <= 9) && (0 <= lineY[0]) && (lineY[2] <= 9) && (((lineX[2] - lineX[0] == 2) && (lineY[0] == lineY[1] && lineY[1] == lineY[2])) || ((lineY[2] - lineY[0] == 2) && (lineX[0] == lineX[1] && lineX[1] == lineX[2])))) {

                        if ((isAPartofEmptyArea(lineX[0], lineY[0])) && (isAPartofEmptyArea(lineX[1], lineY[1])) && (isAPartofEmptyArea(lineX[2], lineY[2]))) {

                            for (int i = 0; i < line.length; i++) {
                                putEmptyArea(lineX[i], lineY[i]);
                            }

                            for (int i = 0; i < line.length; i++) {
                                field[lineX[i]][lineY[i]] = "\uD83D\uDEE5";
                            }


                            showField();
                            int[][] myArr = {{lineX[0], lineY[0]}, {lineX[1], lineY[1]}, {lineX[2], lineY[2]}};

                            shipsList.add(new Ships(3, gameOver, "Трехпалубник", myArr));
                            isAgain = false;
                        } else
                            System.out.println("В плотную к другому кораблю. \nНеверные координаты, попробуйте снова");
                    } else System.out.println("Неверные координаты, попробуйте снова");
                }
            }
        }
    }

    private void putFourDeckShip() {

        boolean isAgain = true;

        while (isAgain) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите координаты четырехпалубного корабля (формат: x,y; x,y; x,y; x,y)");
            if (scanner.hasNext()) {
                String[] line = scanner.nextLine().split(";");

                int[] lineX = new int[4];
                int[] lineY = new int[4];

                for (int i = 0; i < line.length; i++) {
                    try {
                        String[] coordinate = line[i].split(",");
                        lineX[i] = Integer.parseInt(coordinate[0]);
                        lineY[i] = Integer.parseInt(coordinate[1]);
                    } catch (Exception e) {
                        System.out.println("Ошибка, повторите ввод четырехпалубного корабля");
                        putFourDeckShip();
                    }

                }

                Arrays.sort(lineX);
                Arrays.sort(lineY);

                if ((0 <= lineX[0]) && (lineX[3] <= 9) && (0 <= lineY[0]) && (lineY[3] <= 9) && (((lineX[3] - lineX[0] == 3) && (lineY[0] == lineY[1] && lineY[1] == lineY[2] && lineY[2] == lineY[3])) || ((lineY[3] - lineY[0] == 3) && (lineX[0] == lineX[1] && lineX[1] == lineX[2] && lineX[2] == lineX[3])))) {

                    if ((isAPartofEmptyArea(lineX[0], lineY[0])) && (isAPartofEmptyArea(lineX[1], lineY[1])) && (isAPartofEmptyArea(lineX[2], lineY[2])) && (isAPartofEmptyArea(lineX[3], lineY[3]))) {

                        for (int i = 0; i < line.length; i++) {
                            putEmptyArea(lineX[i], lineY[i]);
                        }

                        for (int i = 0; i < line.length; i++) {
                            field[lineX[i]][lineY[i]] = "\uD83D\uDEE5";
                        }

                        showField();

                        int[][] myArr = {{lineX[0], lineY[0]}, {lineX[1], lineY[1]}, {lineX[2], lineY[2]}, {lineX[3], lineY[3]}};

                        shipsList.add(new Ships(4, gameOver, "Четырехпалубник", myArr));
                        isAgain = false;
                    } else System.out.println("В плотную к другому кораблю. \nНеверные координаты, попробуйте снова");
                } else System.out.println("Неверные координаты, попробуйте снова");
            }
        }
    }

}
