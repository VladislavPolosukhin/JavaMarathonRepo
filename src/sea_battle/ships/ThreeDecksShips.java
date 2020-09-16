package sea_battle.ships;

import sea_battle.Destroy;

public class ThreeDecksShips implements Ships {

    int[][] coordinatesOfTheDeck;
    private int wound = 0;
    private Destroy destroy;

    public ThreeDecksShips(Destroy destroy, int[][] coordinates) {
        this.destroy = destroy;
        coordinatesOfTheDeck = coordinates;
    }


    @Override
    public void getDamage(String playerName) {
        wound++;
        System.out.println("Ранил");
        if (wound == 3) {
            System.out.println("Трехпалубник уничтожен");
            destroy.Damagecount(playerName);
        }
    }

    @Override
    public int[][] getCordinatesOfTheDeck() {
        return coordinatesOfTheDeck;
    }

}
