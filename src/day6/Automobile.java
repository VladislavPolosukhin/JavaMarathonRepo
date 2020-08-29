package day6;

public class Automobile {
   private int yearOfBuilding;
   private String color;
   private String model;

    public int getYearOfBuilding() {
        return yearOfBuilding;
    }

    public void setYearOfBuilding(int yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        System.out.println("This car is " + model);
    }

    public int period (int year){
        return year-yearOfBuilding;
    }
}
