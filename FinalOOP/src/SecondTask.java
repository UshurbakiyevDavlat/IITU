public class SecondTask {
    public  static void main(String[]args){
            Picker one = new Picker(0);
            Courier sec = new Courier(0);
            int i = 0;
            int j=0;
            Picker two = new Picker(100);
            Courier three = new Courier(200);


            while(i<1500) {
                one.doWork();
                sec.doWork();
                i++;
            }
            one.bonus();
            sec.bonus();

            while (j<1500){
                two.doWork();
                three.doWork();
                j++;
            }
            two.bonus();
            three.bonus();

        System.out.println(one.toString());
        System.out.println(sec.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println("Orders:"+one.warehouse.getCountOrder());
        System.out.println("Balance:"+sec.warehouse.getBalance());


    }
}
