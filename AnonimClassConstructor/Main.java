import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private static final String path = "C:\\Users\\Moon\\IdeaProjects\\OOPPracticeLab\\src\\Source\\users.dock";

    private static Student oit(String name, double gpa, final int join){
        return new Student(name,gpa){
            int join;
            {this.join = join;}
            @Override
            void printBuahahahaha() {
                System.out.println(name+" Confidential");
            }
        };
    }

    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student("Lfjkls",2.5));
        st.add(oit("gkerge",3.6,9000));
        st.add(new Student("Lopts",2.5));

        for (Student stud:st)
            stud.printBuahahahaha();

    }
}

class Student{
    String name;
    double gpa;

    void printBuahahahaha(){
        System.out.println(name+" "+gpa);
    }

    public Student() {
    }
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}