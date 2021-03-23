package Davlat;

 class Q{
        int n;
        boolean valueSet = false;

     synchronized public  void put(int n){
            while (valueSet)
                    try {
                        wait();
                    } catch (Exception e){
                        System.out.println("Exception"+e);
                    }

                    valueSet = true;
                    this.n = n;

                System.out.println("Putted:" + n);
                    notify();

     }
     synchronized public int get(){
            while (!valueSet)
                try {
                    wait();
                } catch (Exception e){
                    System.out.println("Exception" + e);
                }
                valueSet = false;
                System.out.println("Getted:"+n);
                    notify();
                 return n;
     }

}
class Producer implements  Runnable{
        Q q;
        int n;

        Producer(Q q){
            this.q = q;
            new Thread(this,"Producer").start();
        }

    @Override
    public void run() {
            n = 0;
            int i = 0;
            while (i<10) {
                q.put(n++);
                i++;
            }
    }
}

class Consumer implements  Runnable{
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this,"Consumer").start();
    }
    @Override
    public void run() {
        int i=0;
        while (i<10){
            q.get();
            i++;
        }
    }
}

public class Main {
        public static  void main(String[]args){
            Q q  = new Q();
            new Producer(q);
            new Consumer(q);
            System.out.println("Enter ctrl-c for stop the program");
        }
}
