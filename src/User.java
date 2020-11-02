import java.io.Serializable;
import java.util.ArrayList;

/*public class User {
int id;
String login;
String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public static User parS (String line) {
        String [] arrS = line.split(" ");
        return (new User(Integer.parseInt(arrS[0]),arrS[1],arrS[2]));
    }

    @Override
    public String toString() {
        return  id + " "
                 + login  +
                 " " + password ;
    }
}
*/
/*class User implements Serializable {
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
*/
