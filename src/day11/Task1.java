package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = Warehouse.getWarehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 1500 ; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println(warehouse);
        System.out.println("Picker's salary is " + picker.getSalary());
        System.out.println("Courier's salary is " + courier.getSalary());
    }
}
