package Davlat;

import java.util.Scanner;

class FactRec{
    int Factorial(int a){
        if(a == 1) return  1;
        return Factorial(a-1)*a;

        // Приходит значение к примеру 3, далее он проверяет если это не 1, то он посылает дальше
        // Что ж здесь, он передает значение декрементируя его и посылая как аргумент опять в эту же функцию
        // До тех пор пока он не подойдет под условия остановки
        // Как только получен 1 он возвращает цепь событий
        // на 2 вызове функции он возвращает 1 и умножает его на 2
        // далее он результат, т.е 2 , умножает на 3 из первого вызова.
        // в итоге получаем 6

    }
}
public class Main {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        FactRec f = new FactRec();
        System.out.println("Enter the number which you want to know factorial from:");
        int a = sc.nextInt();
        System.out.println("Factorial of " + a + " is:" + f.Factorial(a));

    }
}
