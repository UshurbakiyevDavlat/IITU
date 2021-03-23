package Davlat;

class NewThread implements Runnable{
        String name;
        Thread t;
        boolean suspendFlag;

    NewThread(String Threadname){
        this.name = Threadname;
        t = new Thread(this,name);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        for(int i = 15; i > 0;i--){
            try {
                System.out.println(name + ":" + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }catch (Exception e){
                System.out.println(e + "Exception");
            }
        }
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
        public  static void main(String[]args) {
            NewThread ob1 = new NewThread("First");
            NewThread ob2 = new NewThread("Second");

            try{
                Thread.sleep(1000);
                ob1.mySuspend();
                System.out.println("Stop first thread");
                Thread.sleep(1000);
                ob1.myResume();
                System.out.println("Run first thread");
                Thread.sleep(1000);
                ob2.mySuspend();
                System.out.println("Stop second thread");
                Thread.sleep(1000);
                ob2.myResume();
                System.out.println("Run second thread");


            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                System.out.println("Waiting end of the threads:");
                ob1.t.join();
                ob2.t.join();

            } catch (Exception e){
                e.printStackTrace();
            }

            System.out.println("Main thread has ended");
        }

}
