package Dictator;

import java.util.ArrayList;

public class RandomEventTitle{
    private ArrayList<String> eventList = new ArrayList<>();
    public String getRandomEvent(){
        return eventList.get((int)(Math.random()*eventList.size()-0.01));
    }
    public RandomEventTitle() {
        eventList.add("title/review review review/A.-20:P.10:N.0/A.40:P.-15:N.0");
        eventList.add("title2/review review review/A.-20:P.10:N.0/A.40:P.-15:N.0");
        eventList.add("title3/review review review/A.-20:P.10:N.0/A.40:P.-15:N.0");
        eventList.add("title4/review review review/A.-20:P.10:N.0/A.40:P.-15:N.0");
    }
}