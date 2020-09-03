package day11;

public class Warehouse {
    private int countOrder;
    private int balance;
    private static Warehouse warehouse;


    public void workWithOrders(){
        countOrder++;
    }

    public void workWithBalance(){
        balance = balance + 1000;
    }

    private Warehouse(){
    }

    public static Warehouse getWarehouse(){
        if (warehouse == null){
            warehouse = new Warehouse();
        }
        return warehouse;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Orders are " + countOrder + "\n Balance is " + balance;
    }
}
