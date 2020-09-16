package sea_battle.ships;

import sea_battle.Destroy;

public class OneDeckShip implements Ships {


    int[][] coordinatesOfTheDeck;
    private int wound = 0;
    private Destroy destroy;

    public OneDeckShip(int[][] coordinatesOfTheDeck, Destroy destroy) {
        this.coordinatesOfTheDeck = coordinatesOfTheDeck;
        this.destroy = destroy;
    }

    @Override
    public void getDamage(String playerName) {
        wound++;
        System.out.println("Ранил");
        System.out.println("Однопалубник уничтожен");
        destroy.Damagecount(playerName);
    }

    @Override
    public int[][] getCordinatesOfTheDeck() {
        return coordinatesOfTheDeck;
    }


}
