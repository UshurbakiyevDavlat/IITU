public class Courier implements Worker {
        private int salary;
        Warehouse warehouse = new Warehouse();
        public Courier(int salary){
            this.salary = salary;
        }
    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
            salary+=100;
      warehouse.setBalance(warehouse.getBalance()+1000);

    }

    @Override
    public void bonus() {
        if(warehouse.getBalance()>999999)salary*=2;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
