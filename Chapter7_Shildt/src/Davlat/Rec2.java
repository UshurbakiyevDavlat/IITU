package Davlat;
class RecTest{
    int []values;

    RecTest(int i){
        values = new int[i];
    }

    void PrintArray(int i){
        if(i == 0) return;
        else PrintArray(i - 1);
        System.out.println("[" + (i-1) + "]" + values[i-1]);
    }
}
public class Rec2 {
    public static void main(String[]args){
        RecTest recTest = new RecTest(10);
        for(int i = 0; i < 10;i++){
            recTest.values[i] = i;
        }
        recTest.PrintArray(10);
    }

}
