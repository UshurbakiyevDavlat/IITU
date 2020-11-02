package Dictator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Event {
//    public abstract void getEventTitle();
//    public abstract void getCoefficient();
//    public abstract String getEventString();

}

class SimpleEvent extends Event{
    String [] event;
    private int armyCoefficient=-20;
    private int peopleCoefficient=10;
    private int nobleCoefficient=0;

    private void safeCoefficient(boolean answer){
        String coefficients;
        if (answer){
            coefficients = event[2];

        }
        else{
            coefficients = event[3];

        }

    }

    public String getTitle(){
        return event[0];
    }
    public String getQuestion(){
        return event[1];
    }

    public void choice(Kingdom kingdom, boolean choic){


    }


//    @Override
//    public String getEventString() {
//        return event;
//    }

    public SimpleEvent(RandomEventTitle randomEvent) {
        this.event = randomEvent.getRandomEvent().split("/");
    }
}

/*
simpleEvent
Arraylist<String>
Ffgfd|SDfnrkfmeorfmo jeroi goigj roito itjgoirjti jro joer|A.20:P.-20


*/
