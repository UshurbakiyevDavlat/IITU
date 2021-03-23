package Davlat;

class Outer{
    int outer_x = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println(outer_x + " from Inner within the Outer class");
        }
    }
}

class Outer2{
    int outer_x2 = 1;

    void test2(){
        for(int i = 0 ; i < 10; i++){
            class Inner2{
                void display(){
                    System.out.println("From Inner within the Outer class and for cycle " + outer_x2++);
                }
            }
            Inner2 nner2 = new Inner2();
            nner2.display();
        }

    }

}
public class InnerClassExample {
        public static  void main(String[]args){
//            Outer outer = new Outer();
//            outer.test();

            Outer2 outer2 = new Outer2();
            outer2.test2();
        }
}
