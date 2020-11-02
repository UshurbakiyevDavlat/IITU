public class Jobs  {
    private String name;
    private  int pay;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Jobs(String name, int pay, int level) {
        this.name = name;
        this.pay = pay;
        this.level = level;
    }

    static  Jobs parS(String line ){
        String [] arrS = line.split("/");
        return (new Jobs((arrS[0]),Integer.parseInt(arrS[1]),Integer.parseInt(arrS[2])));
    }
    @Override
    public String toString() {
        return "Jobs{" +
                "name='" + name + '\'' +
                ", pay=" + pay +
                ", level=" + level +
                '}';
    }
}
