package day11;

public class Courier implements Worker{
    private int salary= 100;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
       warehouse.workWithBalance();
       if (warehouse.getBalance() % 1000000 == 0){
           bonus();
       }
    }

    @Override
    public void bonus() {
    salary = salary * 2;
    }
}
