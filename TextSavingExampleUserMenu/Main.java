import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private static final String path = "C:\\Users\\Moon\\IdeaProjects\\OOPPracticeLab\\src\\Source\\";

    private static void saveUserList(ArrayList<User> userArrayList){
        try{
            FileWriter writer = new FileWriter(path+"text.txt");
            for (User user:userArrayList){
                writer.write(user.toString()+"\n");
            }
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static ArrayList<User> getUserList(){
        ArrayList<User> resultUserList = new ArrayList<>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path+"text.txt"));
            while((line = reader.readLine())!=null){
                resultUserList.add(User.fromString(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultUserList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<User> userList = getUserList();
        int choice;
        boolean cycle = true;
        while(cycle){
            System.out.println("PRESS [1] TO ADD USERS\n" + "PRESS [2] TO LIST USERS\n" +
                    "PRESS [3] TO DELETE USERS\n" + "PRESS [4] TO EXIT");
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    userList.add(new User(sc.nextInt(),sc.next(),sc.next()));
                    break;
                }
                case 2:{
                    for (User user:userList)
                        System.out.println(user.toString());
                    break;
                }
                case 3:{
                    int id = sc.nextInt();
                    for (User user:userList){
                        if(user.getId()==id) {
                            userList.remove(user);
                            break;
                        }
                    }
                    break;
                }
            }

            if (choice == 4) cycle = false;
        }
        saveUserList(userList);
    }
}

class User{
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