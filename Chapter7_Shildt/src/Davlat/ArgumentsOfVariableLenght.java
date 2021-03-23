package Davlat;

public class ArgumentsOfVariableLenght {
        static  void vaTest(int... v){
            System.out.println("vaTest(int ... v): "
            + " Amount of arguments: " + v.length
                    + " Information: ");

            for(int i : v){
                System.out.println(i + " ");
                System.out.println();
            }
        }

        static  void vaTest(boolean ... b){
            System.out.println(" vaTest(boolean ... v : " +
                    " Amount of arguments: " + b.length+
                    " Information: ");
            for(boolean j : b){
                System.out.println(j+" ");
                System.out.println();
            }
        }

        static void vaTest(String msg,int ...v){
            System.out.println(" String,int... v " +
                    " msg:" + msg + " " +
                    " Amount of arguments: " + v.length + " " +
                    " Information: ");
            for(int i : v){
                System.out.println(i + " ");
                System.out.println();
            }

        }

        public static void main(String[]args){
                vaTest(1,2,3);
                vaTest("VCheck",2,3,5);
                vaTest(false,true,false,true,true);

        }
}
