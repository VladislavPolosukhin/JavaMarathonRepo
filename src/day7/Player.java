package day7;

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;
    private int stamina;
    private String name;

    public Player(String name) {
        if (countPlayers < 6) {
            countPlayers++;
        }
        stamina = (int) (90 + Math.random() * 11);
        this.name = name;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные, еще есть " + ((6 - countPlayers > 1) ? (6 - countPlayers) + " свободных мест" : "одно свободное место"));
        } else {
            System.out.println("Мест в командах больше нет");
        }
    }

    public void run() {

        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == 0) {
                System.out.println("Игрок " + name + " устал и покидает поле");
                countPlayers--;
            }
        }


    }

}
