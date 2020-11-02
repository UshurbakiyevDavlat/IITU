import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//public class Main {
 /*   private static final String path = "C:\\Users\\dushu\\IdeaProjects\\TextSavingExample\\src\\";

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
}*/
////////////////////////////////////////////////////
 /*public static final String path = "C:\\Users\\dushu\\IdeaProjects\\TextSavingExample\\src\\";

 public static  void writeUs(ArrayList<User> userList) {
     try {
         FileWriter writer = new FileWriter(path + "text.txt");
         for (User user : userList) {
             writer.write(user.toString()+"\n");
         } writer.close();
     }
     catch (Exception e){
         System.out.println("Sorry throw an Exception");
     }
 }

 public static  ArrayList <User> getUs () {
     ArrayList <User> lUser = new ArrayList<>();
     try {
         BufferedReader reader = new BufferedReader(new FileReader(path + "text.txt"));
         String line;
         while((line = reader.readLine())!=null){
                lUser.add(User.parS(line));
         }

     }
     catch (Exception e) {
         System.out.println("Sorry,throw Exception");
     }
     return lUser;
 }

 public static void main (String[]args){
 Scanner sc = new Scanner(System.in);
 ArrayList<User> userList = getUs();
 boolean c = true;
            while(c) {
                System.out.println("PRESS [1] TO ADD USERS\n" +
                        "PRESS [2] TO LIST USERS\n" +
                        "PRESS [3] TO DELETE USERS\n" +
                        "PRESS [4] TO EXIT");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        userList.add(new User(sc.nextInt(),sc.next(),sc.next()));
                        break;

                    case 2:
                        for(User user :userList){
                            System.out.println(user.toString());
                        }
                        break;

                    case 3:
                        System.out.println("Enter the id of what you want to delete:");
                            int id = sc.nextInt();
                        userList.removeIf(user -> user.getId() == id);
                        break;

                    case 4:
                        c = false;
                        System.out.println("Good-bye!");
                        break;
                }
            }
        writeUs(userList);

 }

}*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*public class Main{
    private static final String path = "C:\\Users\\dushu\\IdeaProjects\\TextSavingExample\\dada.txt";

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
}*/

/*public class Main {
    public static  void main(String[]args) {
        String path = "C:\\Users\\dushu\\IdeaProjects\\TextSavingExample\\src\\hello.txt";
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User(1, "DavSource", "dada2000"));
        userArrayList.add(new User(2, "MaLiUpset", "forgive"));
        userArrayList.add(new User(3, "YouAreNotWrong", "forget"));

        ArrayList<Admin> adminArrayList = new ArrayList<>();
        adminArrayList.add(new Admin(3000));
        adminArrayList.add(new Admin(5000));
        adminArrayList.add(new Admin(10000));

        try {
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(path));

            for(User user : userArrayList){
                writer.writeObject(user);
            }
            ObjectOutputStream writerS = new ObjectOutputStream(new FileOutputStream(path,true));
            for(Admin admin : adminArrayList){
                writer.writeObject(admin);
            }
            writerS.close();
            writer.close();

            FileInputStream file = new FileInputStream(path);
            ObjectInputStream reader = new ObjectInputStream(file);

            for (int i=0;i<3;i++)
                System.out.println(((User)reader.readObject()).toString());
            for (int i=0;i<3;i++)
                System.out.println(((Admin)reader.readObject()).toString());

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/

public class Main {

  /*  public static  void addWork(ArrayList<Handyman> userList) {
        try {
            FileWriter writer = new FileWriter(pathJobs + "jobs.txt");
            for (User user : userList) {
                writer.write(user.toString()+"\n");
            } writer.close();
        }
        catch (Exception e){
            System.out.println("Sorry throw an Exception");
        }
    }
*/
    /*public static  ArrayList <User> getWork () {
        ArrayList <User> lUser = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path + "text.txt"));
            String line;
            while((line = reader.readLine())!=null){
                lUser.add(User.parS(line));
            }

        }
        catch (Exception e) {
            System.out.println("Sorry,throw Exception");
        }
        return lUser;
    }
*/
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        String pathWorker = "C:\\Users\\dushu\\IdeaProjects\\TextSavingExample\\src\\workers.txt";
        String pathJobs = "C:\\Users\\dushu\\IdeaProjects\\TextSavingExample\\src\\";

        ArrayList<Handyman>workers = new ArrayList<>();
        ArrayList<String> tasks = new ArrayList<>();
        int j = 0;
        boolean c = true;
        while (c) {
            System.out.println(" [1] TO VIEW WORKERS\n" +
                    " [2] TO VIEW JOBS\n" +
                    " [3] TO ADD WORKERS\n" +
                    " [4] TO ADD JOB\n" +
                    " [5] TO GIVE JOB\n" +
                    " [0] TO EXIT");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        FileInputStream file = new FileInputStream(pathWorker);
                        ObjectInputStream reader = new ObjectInputStream(file);
                        while (file.available() > 0) {
                            workers.add((Handyman) reader.readObject());
                        }
                        if (workers.isEmpty()) {
                            System.out.println("No free people");
                            break;
                        } else {
                            for (Handyman work : workers) {
                                System.out.println(work + " ");
                                work.showWorkDone();
                            }
                        }
                        break;
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }


                case 2:
                        String line;

                        try {
                            BufferedReader reader = new BufferedReader(new FileReader(pathJobs+"jobs.txt"));
                            while ((line = reader.readLine()) != null && j<1) {
                                tasks.add(line);
                            }
                            j++;

                            if(tasks.isEmpty()){
                                System.out.println("There are no work to be done");
                                break;
                            }

                            int i = 0;
                            for (String list:tasks) {
                                System.out.println("Id = " + i + " " + list);
                                i++;
                            }


                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                case 3:

                    try {
                        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(pathWorker));
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathWorker));
                        if(!workers.isEmpty()){
                            for (Handyman worker : workers) {
                                writer.writeObject(worker);
                            }
                        } else {
                            //int id, String name, int level, int bankAccount
                            workers.add(new Handyman(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));

                        }
                        writer.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:

                    tasks.add(sc.next());

                    try {
                        FileWriter writer = new FileWriter(pathJobs+"jobs.txt");
                        for (String task:tasks) {
                            writer.write(task);
                            writer.append("\n");
                            writer.flush();
                        }
                        writer.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    try {
                        if(tasks.isEmpty()){
                            System.out.println("There are no work to be done");
                            break;
                        }
                        int i = 0;
                        for (String list:tasks) {
                            System.out.println("Id = " + i + " " + list);
                            i++;
                        }
                        System.out.println("Enter id of work");
                        int input = sc.nextInt();
                        for (Handyman hand:workers) {
                            System.out.println(hand);
                        }
                        System.out.println("Enter id of worker");
                        int input1 = sc.nextInt();
                        for (Handyman hand:workers) {
                            if(hand.getId() == input1){
                                if(hand.giveWork(tasks.get(input))){
                                    tasks.remove(input);
                                }
                            }
                        }
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    break;


                case 0:
                    c = false;
                    break;
            }
        }
    }
}












