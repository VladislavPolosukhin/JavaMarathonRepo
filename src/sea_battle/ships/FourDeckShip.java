package sea_battle.ships;

import sea_battle.Destroy;

public class FourDeckShip implements Ships {

    int[][] coordinatesOfTheDeck;
    private int wound = 0;
    private Destroy destroy;

    public FourDeckShip(int[][] coordinatesOfTheDeck, Destroy destroy) {
        this.coordinatesOfTheDeck = coordinatesOfTheDeck;
        this.destroy = destroy;
    }

    @Override
    public void getDamage(String playerName) {
        wound++;
        System.out.println("Ранил");
        if (wound == 4) {
            System.out.println("Четырехпалубник уничтожен");
            destroy.Damagecount(playerName);
        }
    }

    @Override
    public int[][] getCordinatesOfTheDeck() {
        return coordinatesOfTheDeck;
    }
}
