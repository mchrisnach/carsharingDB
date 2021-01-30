package createObjects;

import storedobjects.Journey;

import java.util.ArrayList;

import static createObjects.CarFactory.randInt;

public class JourneyFactory {

    private ArrayList<Journey> journeyList;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public ArrayList<Journey> getJourneyList() {
        return journeyList;
    }

    public JourneyFactory(int amount){
        this.amount  = amount;
        this.journeyList = createJourneys();
    }


    public ArrayList<Journey> createJourneys(){
        ArrayList<Journey> journeyL = new ArrayList<Journey>();
        for (int i = 0; i <= getAmount() ; i++) {
            int objectId = randInt(1, 100);
            int time = randInt(1, 100);
            int distance = randInt(1, 100);

            Journey newJourney = new Journey(objectId, time, distance);
            journeyL.add(newJourney);
        }
        return journeyL;
    }
}
