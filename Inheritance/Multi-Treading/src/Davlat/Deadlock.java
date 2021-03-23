package Davlat;

class A{
    String name = Thread.currentThread().getName();
    void foo(B b){
        System.out.println(name + " Enter to method A.foo()");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e + "Exception");
        }

        System.out.println(name + " trying to call B.last()");
        b.last();
    }
   synchronized void last(){
       System.out.println(" In A.last() method");
    }

}
class  B{
    synchronized void bar(A a){
    String name = Thread.currentThread().getName();
        System.out.println(name + " Enter to B.bar()");

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e  + "Exception");
        }

        System.out.println(name + " Trying to call method A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println(" in A.last() method");
    }
}

public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();

     Deadlock(){
         Thread.currentThread().setName("Main-Thread");
         Thread t = new Thread(this,"Additional-Thread");
         t.start();

         a.foo(b);
         System.out.println("Back to main thread");
     }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back to another thread");
    }

    public  static  void main(String[]args){
        new Deadlock();
    }
}
