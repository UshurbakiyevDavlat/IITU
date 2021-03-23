package Davlat;

abstract  class  AbsFigure{
    int dim1;
    int dim2;

    AbsFigure(int a,int b){
        this.dim1 = a;
        this.dim2 = b;
    }
    abstract  int area();
}

class  AbsTriangle extends AbsFigure{
    AbsTriangle(int a,int b){
        super(a,b);
    }

    int area(){
        System.out.println("Within the Tringle space.");
        return dim1 * dim2;
    }
}

class AbsRectangle extends AbsFigure{
    AbsRectangle(int a,int b){
            super(a,b);
        }

        int area(){
            System.out.println("Within the Rectangle space.");
            return (dim1*dim2)/2;
        }
}
public class AbsFigureEx {
        public static void main(String[]args){
           AbsFigure fig;

            AbsTriangle t = new AbsTriangle(10,4);
            AbsRectangle r = new AbsRectangle(4,7);

            fig = t;

            System.out.println("Sector is:" + fig.area());

            fig = r;

            System.out.println("Sector is:" + fig.area());
        }
}
