import java.io.FileInputStream;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamAPIExample {
    public static void main(String[] args) {
        int [] arr = {1,7,3,5,7,3,2,9,2,6};
        Stream<Student> stream = Stream.of(
                new Student(19434, "Khalissi", 2.7,true),
                new Student(29444, "Jameson", 9.7),
                new Student(12354, "Lfjekrn", 0.7),
                new Student(23454, "Tlhy,tl", 1.7,true),
                new Student(12674, "Qwlkjg", 3.0),
                new Student(10934, "Jorekogk", 2.3,true),
                new Student(10934, "KLvrjenv", 3.3),
                new Student(10934, "kwkefhkw", 2.3),
                new Student(28434, "Litrijh", 1.4),
                new Student(31034, "Yofjdkb", 0.0,true),
                new Student(30034, "Corei", 12.7)
        );
        stream.filter(s -> !s.isGrant() && s.getGpa()<4).sorted(Comparator.comparing(Student::getGpa).reversed()).
                limit(3).forEach(g-> {
            g.setGrant(true);
            System.out.println(g.toString());
        });
    }
}
class Student{
    private int id;
    private String name;
    private double gpa;
    private boolean grant;
    public boolean isGrant() {
        return grant;
    }
    public void setGrant(boolean grant) {
        this.grant = grant;
    }
    public Student(int id, String name, double gpa, boolean grant) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.grant = grant;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.grant = false;
    }
}