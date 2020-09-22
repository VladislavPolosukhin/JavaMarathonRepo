package sea_battle;

public class Game {

    private static boolean isAGameOver = false;

    public static void main(String[] args) {



        GameOver gameOver = new  GameOver() {
            @Override
            public void gameOver(String playerName) {
                System.out.println(playerName + " одержал победу! \n Поздравляем!!!");
                isAGameOver = true;
            }
        };

        Field field1 = new Field(gameOver);
        Field field2 = new Field(gameOver);

        Player player1 = new Player("Player1", field2, field1);
        System.out.println(player1.getName() + " расставялет корабли");
        field1.putShips();

        Player player2 = new Player("Player2", field1, field2);
        System.out.println(player2.getName() + " расставялет корабли");
        field2.putShips();

        int choose = (int) (1 + Math.random() * 2);
        System.out.println(choose);
        if (choose == 1) {
            System.out.println(player1.getName() + " начинает игру");

            while (!isAGameOver) {

                boolean player1Shot = true;
                while (player1Shot) {
                    System.out.println("Стреляет " + player1.getName());
                    player1Shot = player1.shot();
                    if (isAGameOver) {
                        break;
                    }
                }

                boolean player2Shot = true;
                while (player2Shot) {
                    System.out.println("Стреляет " + player2.getName());
                    player2Shot = player2.shot();
                    if (isAGameOver) {
                        break;
                    }
                }

            }
        } else {
            System.out.println(player2.getName() + " начинает игру");

            while (!isAGameOver) {

                boolean player2Shot = true;
                while (player2Shot) {
                    System.out.println("Стреляет " + player2.getName());
                    player2Shot = player2.shot();
                    if (isAGameOver) {
                        break;
                    }
                }

                boolean player1Shot = true;
                while (player1Shot) {
                    System.out.println("Стреляет " + player1.getName());
                    player1Shot = player1.shot();
                    if (isAGameOver) {
                        break;
                    }
                }

            }
        }

    }


}

