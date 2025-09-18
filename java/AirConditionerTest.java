import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testForTheDifaultStateOfTemperature(){
        AirConditioner  airConditioner = new AirConditioner();
        assertEquals(0, airConditioner.getTemperature());

    }

    @Test
    public void testForTheDifaultStateOftheOn(){
        AirConditioner  airConditioner = new AirConditioner();
        assertFalse(airConditioner.isOn());

    }

    @Test
    public void testForTheDifaultStateOfTheName(){
        AirConditioner  airConditioner = new AirConditioner();
        assertEquals("None", airConditioner.getName());


    }

    @Test
    public void testToSetAnAirConditionerTurnItOnAndIncreaseTheTemperature(){
            AirConditioner  airConditioner = new AirConditioner();
            airConditioner.setName("MY AIR CONDITIONER");
            airConditioner.setIsOn();
            airConditioner.setTemperature(17);

            assertEquals("MY AIR CONDITIONER", airConditioner.getName());
            assertEquals(17, airConditioner.getTemperature());
            assertTrue(airConditioner.isOn());

        }
    @Test
    public void testToTurnOnTheAirConditionerIncreasesTheInitialValueBYOne(){
        AirConditioner  airConditioner = new AirConditioner();
        airConditioner.setName("MY AIR CONDITIONER");
        airConditioner.setIsOn();
        airConditioner.temperatureUp();
        airConditioner.temperatureUp();
        airConditioner.temperatureUp();


        assertEquals("MY AIR CONDITIONER", airConditioner.getName());
        assertEquals(19, airConditioner.getTemperature());
        assertTrue(airConditioner.isOn());

    }
    @Test
    public void testToTurnOnTheAirConditionerIncreasesTheInitialValueAndDecreaseBYOne(){
        AirConditioner  airConditioner = new AirConditioner();
        airConditioner.setName("MY AIR CONDITIONER");
        airConditioner.setIsOn();
        airConditioner.setTemperature(20);
        airConditioner.temperatureDown();
        airConditioner.temperatureDown();
        airConditioner.temperatureDown();

        assertEquals("MY AIR CONDITIONER", airConditioner.getName());
        assertEquals(17, airConditioner.getTemperature());
        assertTrue(airConditioner.isOn());

    }
    @Test
    public void testToTurnOnTheAirConditionerIncreasesTheTemperatureAndTurnItOff(){
        AirConditioner  airConditioner = new AirConditioner();
        airConditioner.setName("MY AIR CONDITIONER");
        airConditioner.setIsOn();
        airConditioner.setTemperature(20);
        airConditioner.temperatureDown();
        airConditioner.temperatureDown();
        airConditioner.temperatureDown();
        airConditioner.setIsOff();

        assertEquals("MY AIR CONDITIONER", airConditioner.getName());
        assertEquals(0, airConditioner.getTemperature());
        assertFalse(airConditioner.isOn());

    }

    @Test
    public void testIfTheAirConditionerWillWorkWhenOff(){
        AirConditioner  airConditioner = new AirConditioner();
        airConditioner.setName("MY AIR CONDITIONER");
        airConditioner.setIsOn();
        airConditioner.setIsOff();
        airConditioner.setTemperature(20);
        airConditioner.temperatureDown();
        airConditioner.temperatureDown();
        airConditioner.temperatureDown();


        assertEquals("MY AIR CONDITIONER", airConditioner.getName());
        assertEquals(0, airConditioner.getTemperature());
        assertFalse(airConditioner.isOn());

    }

    @Test
    public void testForHigherTemperatureThatsOverTheSetLimit(){
        AirConditioner  airConditioner = new AirConditioner();
        airConditioner.setName("MY AIR CONDITIONER");
        airConditioner.setIsOn();
        airConditioner.setTemperature(50);


        assertEquals("MY AIR CONDITIONER", airConditioner.getName());
        assertEquals(16, airConditioner.getTemperature());
        assertTrue(airConditioner.isOn());

    }
    @Test
    public void testLowerTemperatureThatLowerThanTheLimit(){
        AirConditioner  airConditioner = new AirConditioner();
        airConditioner.setName("MY AIR CONDITIONER");
        airConditioner.setIsOn();
        airConditioner.setTemperature(12);

        assertEquals("MY AIR CONDITIONER", airConditioner.getName());
        assertEquals(16, airConditioner.getTemperature());
        assertTrue(airConditioner.isOn());

    }

    }

