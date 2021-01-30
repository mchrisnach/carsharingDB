package storedobjects;

import org.bson.Document;

public class Journey implements IStoreableObject {
    public Journey(int carID, int time, int distance) {
        this.carID = carID;
        this.time = time;
        this.distance = distance;
    }

    @Override
    public Document toDocument() {
        Document doc = new Document();
        if (carID != 0)
            doc.append("carObjectID", carID);
        if (time != 0)
            doc.append("time", time);
        if (distance != 0)
            doc.append("distance", distance);
        return doc;
    }

    // car object id for the journey
    private int carID;

    // time in hrs
    private int time;

    // distance in hrs
    private int distance;

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
