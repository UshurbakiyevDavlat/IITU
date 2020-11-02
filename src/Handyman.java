import java.io.Serializable;
import java.util.ArrayList;

public class Handyman implements Serializable {
   private int id;
    private  String name;
    private int level;
    private  int bankAccount;
    private ArrayList<String>taskDoneList;

    public Handyman() {
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public ArrayList<String> getTaskDoneList() {
        return taskDoneList;
    }

    public void setTaskDoneList(ArrayList<String> taskDoneList) {
        this.taskDoneList = taskDoneList;
    }

    public Handyman(int id, String name, int level, int bankAccount ) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.bankAccount = bankAccount;
    }

    boolean giveWork(String workLine){
        String [] arrS = workLine.split("/");

        if(Integer.parseInt(arrS[2])<=level){
            bankAccount +=Integer.parseInt(arrS[1]);
            return true;

        } else {
            return  false;
        }
    }

    void showWorkDone(){
        System.out.println(taskDoneList);

    }

    @Override
    public String toString() {
        return "Handyman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", bankAccount=" + bankAccount +
                ", taskDoneList=" + taskDoneList +
                '}';
    }
}
