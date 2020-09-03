package day11;

public class Picker implements Worker{

    private int salary = 80;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        warehouse.workWithOrders();
        if (warehouse.getCountOrder() % 1500 == 0){
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary = salary * 3;
    }
}
