package study.vehicle;

public class Vehicle {
    protected String carName;
    protected String wheels;
    protected boolean canItSteer;

    public void Vehicle(String carName, String wheels, boolean canItSteer){
        this.carName = carName;
        this.wheels = wheels;
        this.canItSteer = canItSteer;
    }

    public String getCarName() {
        return carName;
    }

    public String getWheels() {
        return wheels;
    }

    public boolean isCanItSteer() {
        return canItSteer;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setCanItSteer(boolean canItSteer) {
        this.canItSteer = canItSteer;
    }
}
