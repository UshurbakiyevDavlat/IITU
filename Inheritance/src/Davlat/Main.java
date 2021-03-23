package Davlat;

class Figure{
    int dim1;
    int dim2;

    Figure(int a, int b){
        this.dim1 = a;
        this.dim2 = b;
    }

    void show(){
        System.out.println("Sector can not be found:" + 0);
    }
}
class  Triangle extends Figure{
            Triangle(int a,int b){
                super(a,b);
            }
            @Override
            void show(){
                System.out.println("Within the Triangle space sector is:" + (dim1*dim2));
            }
}

class Rectangle extends  Figure{
        Rectangle(int a, int b){
            super(a,b);
        }

    @Override
    void show() {
        System.out.println("Within the Rectangle space sector is:"+((dim1*dim2)/2));
    }
}

public class Main {
        public static void main(String[]args){
            Figure f = new Figure(10,10);
            Triangle t = new Triangle(8,7);
            Rectangle r = new Rectangle(7,6);

            Figure fake ;

            fake = f;
            fake.show();
            System.out.println();

            fake = t;
            fake.show();
            System.out.println();

            fake = r;
            fake.show();

        }
}
