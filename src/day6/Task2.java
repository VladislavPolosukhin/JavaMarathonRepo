package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(2020, 220,70, "Samsung");
        airplane.setYearOfBuilding(2021);
        airplane.setLength(250);
        airplane.fillUp(50);
        airplane.fillUp(30);
        airplane.info();
    }
}
