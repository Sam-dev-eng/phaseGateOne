public class AirConditioner {
    private String name = "None";
    private int temperature = 16;
    private boolean isOn = false;

    public AirConditioner(){
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setIsOn(){
        isOn = true;
    }
    public void setIsOff(){
        isOn = false;
    }
    public boolean isOn(){
        return isOn;
    }

    public void setTemperature(int newTemperature) {
        if (isOn  && newTemperature > 16 && newTemperature < 30) {
            temperature = newTemperature;
        }
    }
    public int getTemperature(){
        if (!isOn){
            return 0;
        }
        return temperature;
    }
        public void temperatureUp() {
            if (isOn  && temperature >= 16 && temperature < 30) {
                temperature++;
            }
        }
        public void temperatureDown() {
        if (isOn && temperature >= 16 && temperature < 30) {
            temperature--;
        }
        }
    }

