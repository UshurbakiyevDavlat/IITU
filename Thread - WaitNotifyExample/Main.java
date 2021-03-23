package threads;

public class Main {
    public static void main(String[] args) {
        Store store = new Store (2);

        Thread prod = new Thread(new Producer(store,"Retake inc."));
        Thread cons1 = new Thread(new Consumer(store,"Davron"));
        Thread cons2 = new Thread(new Consumer(store,"Rafael"));

        prod.start();
        cons1.start();
        cons2.start();
    }
}

class Producer implements Runnable{
    private Store store;
    private String name;

    public Producer(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            store.add(name);
        }
    }
}
class Consumer implements Runnable{
    private Store store;
    private String name;

    public Consumer(Store store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            store.buy(name);
        }
    }
}

class Store{
    private int good;

    public Store(int good) {
        this.good = good;
    }

    public synchronized void add(String name){
        System.out.println(name + " go to Store");
        try{
            while (good>=5){
                System.out.println("Store is full");
                wait();
            }
            Thread.sleep(500);
            System.out.println(name + " add 1 product [" + (++good) + "]");
            notify();
            System.out.println(name + " leave Store\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public synchronized void buy(String name){
        System.out.println(name + " go to Store");
        try{
            while (good<=0){
                System.out.println("Store is empty");
                wait();
            }
            Thread.sleep(500);
            System.out.println(name + " add 1 product [" + (--good) + "]");
            notify();
            System.out.println(name + " leave Store\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

