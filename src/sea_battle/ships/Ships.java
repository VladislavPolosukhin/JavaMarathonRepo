package sea_battle.ships;

import sea_battle.Destroy;
import sea_battle.GameOver;

public class Ships implements Destroy {

    public static final int SHIPS_QUANTITY = 10;
    private static int destroyedShips = 0;
    int[][] coordinatesOfTheDeck;
    private int wound = 0;
    private final int decks;
    private final String name;
    private final GameOver gameOver;

    public Ships(int decks, GameOver gameOver, String name, int[][] coordinatesOfTheDeck) {
        this.decks = decks;
        this.gameOver = gameOver;
        this.name = name;
        this.coordinatesOfTheDeck = coordinatesOfTheDeck;
    }


    public void getDamage(String playerName) {
        wound++;
        System.out.println("Ранил");
        if (wound == decks) {
            System.out.println(name + " уничтожен");
            damageCount(playerName);
        }
    }

    public int[][] getCordinatesOfTheDeck() {
        return coordinatesOfTheDeck;
    }

    @Override
    public void damageCount(String name) {
        destroyedShips++;
        if (destroyedShips == SHIPS_QUANTITY) {
            gameOver.gameOver(name);
        }

    }
}
