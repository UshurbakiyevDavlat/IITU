public class Student{
    private String name;
    private int budget;
    private Double gpa;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
    public Double getGpa() {
        return gpa;
    }
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int budget, Double gpa) {
        this.name = name;
        this.budget = budget;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " " + budget + " gpa=" + gpa;
    }
}
