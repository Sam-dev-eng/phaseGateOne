public class Bike {
    private boolean isOn = false;
    private int gear = 0;
    private int acceleration = 0;

    public void start(){
        isOn = true;
    }
    public void stop(){
        isOn = false;
    }
    public boolean getPower(){
        return isOn;
    }

    public int getGear() {
        return gear;
    }

    public void setGear() {
        if (isOn && gear == 0) {
            gear++;
        }
    }

    public void setAccelerate() {
        if (isOn && (gear > 0) && ((acceleration + gear) <= 123)) {
            acceleration += gear;
            if (acceleration > 20 && gear == 1)gear++;
            else if (acceleration > 30 && gear == 2)gear++;
            else if (acceleration > 40 && gear == 3)gear++;
        }
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setDeceleration() {
        if (isOn) {
            acceleration -= gear;
            if (acceleration < 41 && gear == 4) gear--;
            else if (acceleration < 31 && gear == 3) gear--;
            else if (acceleration < 21 && gear == 2) gear--;
            else if (acceleration < 1 && gear == 1) gear--;
        }
    }


}
