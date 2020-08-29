package day6;

public class Airplane {
    private int yearOfBuilding;
    private int length;
    private int weight;
    private int fuel = 0;
    private String producer;

    public void setYearOfBuilding(int yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Airplane(int yearOfBuilding, int length, int weight, String producer) {
        this.yearOfBuilding = yearOfBuilding;
        this.length = length;
        this.weight = weight;
        this.producer = producer;
    }

    public void info(){
        System.out.println("Изготовитель " + producer + ", год выпуска " + yearOfBuilding + ", вес " + weight + ", объем топлива в баке " + fuel);
    }

    public void fillUp(int fuel) {
        this.fuel =this.fuel + fuel;
    }
}
