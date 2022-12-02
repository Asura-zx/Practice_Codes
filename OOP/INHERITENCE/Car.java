package OOP.INHERITENCE;


public class Car {
    private String exteriorColor;
    private float levelOfFuel;
    private String carType;
    private boolean hoodStatus;
    private float kphSpeed;
    private int wiperSpeed;
    private boolean driverDoorStatus;
    private boolean frontPassengerDoorStatus;
    private String uniqueID;

    public Car(){
        uniqueID="0000AA";
    }

    public Car(String uid){
        uniqueID=uid;
    }

    public String getUID(){
        return uniqueID;
    }

    public void setUID(String uid){
        uniqueID=uid;
    }
    public void setExtColor(String ec){
        exteriorColor=ec;
    }
    public String getExtColor(){
        return exteriorColor;
    }
    public void setLevelOfFuel(float fl){
        levelOfFuel=fl;
    }
    public float getLevelOfFuel(){
        return levelOfFuel;
    }
    public void setCarType(String ct){
        carType=ct;
    }
    public String getCarType(){
        return carType;
    }
    public void setKphSpeed(float ks){
        kphSpeed=ks;
    }
    public float getKphSpeed(){
        return kphSpeed;
    }
    public void setWiperSpeed(int ws){
        wiperSpeed=ws;
    }
    public int setWiperSpeed(){
        return wiperSpeed;
    } 
    public void setDriverDoorStatus(boolean dds){
        driverDoorStatus=dds;
    }
    public boolean setDriverDoorStatus(){
        return driverDoorStatus;
    }
    public void setFrontPassengerDoorStatus(boolean fpds){
        frontPassengerDoorStatus=fpds;
    }
    public boolean setFrontPassengerDoorStatus(){
        return frontPassengerDoorStatus;
    }
    public void setHoodStatus(boolean hs) {
        hoodStatus=hs;
    }
    public boolean setHoodStatus() {
        return hoodStatus;
    }
}
