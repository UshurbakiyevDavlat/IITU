import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private static final String path = "C:\\Users\\Moon\\IdeaProjects\\OOPPracticeLab\\src\\Source\\users.dock";

    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(101,"Johnatan","02398209482"));
        userList.add(new User(103,"Jennis","759679679679"));
        userList.add(new User(105,"Jimm","67967985796795"));
        ArrayList<Admin> adminList = new ArrayList<>();
        adminList.add(new Admin(1000));
        adminList.add(new Admin(1600));
        adminList.add(new Admin(1050));
        try {
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(path));
            for (User user:userList) {
                writer.writeObject(user);
            }
            ObjectOutputStream writer2 = new ObjectOutputStream(new FileOutputStream(path,true));
            for (Admin admin:adminList)
                writer.writeObject(admin);
            writer2.close();
            writer.close();

            FileInputStream file = new FileInputStream(path);
            ObjectInputStream reader = new ObjectInputStream(file);
            for (int i=0;i<3;i++)
                System.out.println(((User)reader.readObject()).toString());
            for (int i=0;i<3;i++)
                System.out.println(((Admin)reader.readObject()).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable{
    private Integer id;
    private String login;
    private String password;

    @Override
    public String toString() {
        return id + " " + login + ' ' + password;
    }

    public static User fromString(String line){
        String [] lineArray = line.split(" ");
        return new User(Integer.parseInt(lineArray[0]),lineArray[1],lineArray[2]);
    }

    public User() {
    }
    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
}

class Admin implements Serializable{
    int salary;

    public Admin(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "salary=" + salary +
                '}';
    }
}