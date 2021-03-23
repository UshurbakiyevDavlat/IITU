import java.util.Scanner;

public class Department {
    private Student [] list;

    public void show(){
        for (Student st:list){
            System.out.println(st.toString());
        }
    }

    public void giveThemAllMoney(int money){
        for (Student st:list){
            if (st.getGpa()>3.3)
                st.setBudget(st.getBudget()+money);
        }
    }

    public Department(int studentCount) {
        list = new Student[studentCount];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<studentCount;i++)
            list[i] = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
    }
}
