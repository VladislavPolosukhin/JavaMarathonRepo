package day7;

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

    public int getLength() {
        return length;
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

    public static void compareAirplanes (Airplane airplane1, Airplane airplane2){
        if (airplane1.getLength() > airplane2.getLength()){
            System.out.println("Airplane 1 is bigger than airplane 2");
        }

        else if (airplane2.getLength() > airplane1.getLength()){
            System.out.println("Airplane 2 is bigger than airplane 1");
        }

        else {
            System.out.println("Airplanes have equal length");
        }
    }
}
