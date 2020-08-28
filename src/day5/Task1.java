package day5;

public class Task1 {
    public static void main(String[] args) {
        Automobile automobile = new Automobile();

        automobile.setYearOfBuilding(1993);
        automobile.setColor("Red");
        automobile.setModel("Porsche 911");

        System.out.println(automobile.getYearOfBuilding());
        System.out.println(automobile.getColor());
        System.out.println(automobile.getModel());
    }
}
