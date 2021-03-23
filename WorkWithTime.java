import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static int getTimeInMinutes(String time){
        return Integer.parseInt(time.split(":")[0])*60+
                Integer.parseInt(time.split(":")[1]);
    }

    static void compareWithInt(String t1, String t2){
        if (getTimeInMinutes(t1)>getTimeInMinutes(t2))
            System.out.println("Sooner");
        else
            System.out.println("Earlier");
    }
    static void compareWithDate(String t1, String t2) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        try {
            Date date1 = sdf.parse(t1);
            System.out.println(date1.toString());
            Date date2 = sdf.parse(t2);
            if (date1.getTime()>date2.getTime())
                System.out.println("Sooner");
            else
                System.out.println("Earlier");
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String t1 = sc.next();
        String t2 = sc.next();
        compareWithDate(t1,t2);
    }
}
