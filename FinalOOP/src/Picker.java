public class Picker  implements Worker{
    private int salary;
    Warehouse warehouse = new Warehouse();
    public Picker(int salary){
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
       warehouse.setCountOrder(warehouse.getCountOrder()+1);

    }

    @Override
    public void bonus() {

        if(warehouse.getCountOrder()>1499)salary *=3;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
