package day6;

public class Motorcycle {
    private int yearOfBuilding;
    private String color;
    private String model;

    public Motorcycle(int yearOfBuilding, String color, String model) {
        this.yearOfBuilding = yearOfBuilding;
        this.color = color;
        this.model = model;
    }

    public void info(){
        System.out.println("This moto is " + model);
    }

    public int period (int year){
        return year-yearOfBuilding;
    }
}
