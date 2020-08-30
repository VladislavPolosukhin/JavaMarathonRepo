package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player("Bob");
        Player player2 = new Player("Jhon");
        Player player3 = new Player("Jess");
        Player player4 = new Player("Bil");
        Player player5 = new Player("Carl");
        Player player6 = new Player("Brad");
        Player.info();

        /*System.out.println(Player.getCountPlayers());
        Player player7 = new Player("Garry");
        System.out.println(Player.getCountPlayers());*/

        for (int i = 0; i < 101 ; i++) {
            player1.run();
        }

        Player.info();

    }

}
