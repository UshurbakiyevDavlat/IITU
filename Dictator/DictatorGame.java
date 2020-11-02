package Dictator;

import java.util.ArrayList;
import java.util.Scanner;

public class DictatorGame {
    private String name;
    private Scanner sc = new Scanner(System.in);
    private Kingdom kingdom = new Kingdom();
    private ArrayList<Event> events = new ArrayList<>();

    private int weeks = 1;

    private void Settings(){
        System.out.println("Introduce yourself, your majesty!");
        name = sc.nextLine();
    }

    private void endEvent(){

    }

    public void start(){
//        while (weeks<=50){
//            System.out.println("Week "+weeks);
//            System.out.println(kingdom.getInfo());
//
//
//            weeks++;
//        }
//        endEvent();

    }

    public DictatorGame() {
        //Settings();
        RandomEventTitle ret = new RandomEventTitle();
        for (int i=0;i<50;i++)
            events.add(new SimpleEvent(ret));
    }
}
