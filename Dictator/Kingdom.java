package Dictator;

public class Kingdom {
    private int army;
    private int people;
    private int noble;

    private int science;
    private int treasury;

    public String getInfo(){
        return "[A:"+army+"|P:"+people+"|N:"+noble+"]";
    }

    public Kingdom() {
        army = people = noble = 500;
        treasury = 10000;
        science = 40;
    }
}

//double
//int
//int
//