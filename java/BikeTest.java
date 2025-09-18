import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void TestTheDefaultStateOfTheBike() {

        Bike bike = new Bike();
        assertFalse(bike.getPower());
    }

    @Test
    public void TestIfTheBikeIsOn() {
        Bike bike = new Bike();
        bike.start();
        assertTrue(bike.getPower());
    }

    @Test
    public void TestIfTheBikeCanTUrnOnAndOff() {
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        assertFalse(bike.getPower());
    }

    @Test
    public void TestForTheCurrentGear() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();

        assertEquals(1, bike.getGear());
    }

    @Test
    public void TestIfTheBikeWillChangeGearWhenOff() {
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        bike.setGear();

        assertEquals(0, bike.getGear());
    }


    @Test
    public void TestForAcceleration() {
        Bike bike = new Bike();
        bike.setAccelerate();

        assertEquals(0, bike.getAcceleration());
    }

    @Test
    public void testForWhenTheBikeIsOnAndAccelerate() {
        Bike bike = new Bike();
        bike.start();
        bike.setAccelerate();

        assertEquals(0, bike.getAcceleration());

    }

    @Test
    public void TestAccelerationWhenTheBikeIsOnAndGearOne() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        bike.setAccelerate();

        assertEquals(1, bike.getAcceleration());

    }

    @Test
    public void TestAccelerationByTwoTimes() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        bike.setAccelerate();
        bike.setAccelerate();
        assertEquals(2, bike.getAcceleration());
    }

    @Test
    public void TestForAccelerationBYThreeTimes() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        bike.setAccelerate();
        bike.setAccelerate();
        bike.setAccelerate();
        assertEquals(3, bike.getAcceleration());
    }

    @Test
    public void TestForWhenTheBikeIsOffAndAcceratesByFourTimes() {
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        bike.setGear();
        for (int count = 0; count < 4; count++) {
            bike.setAccelerate();
        }
        assertEquals(0, bike.getAcceleration());

    }

    @Test
    public void TestForAccelerationIncrementWithTheCurrentGear() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 12; count++) {
            bike.setAccelerate();
        }
        assertEquals(12, bike.getAcceleration());

    }

    @Test
    public void TestIfTheGearDouesNotAddMoreThan4() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        bike.setGear();
        bike.setGear();
        bike.setGear();
        bike.setAccelerate();

        assertEquals(1, bike.getGear());
        assertEquals(1, bike.getAcceleration());
    }

    @Test
    public void TestIfTheTheCurrentGearWillChangeWhenAccelerationExceed20() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 21; count++) {
         bike.setAccelerate();
        }
        assertEquals(21, bike.getAcceleration());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void TestIfTheTheCurrentGearWillChangeWhenAccelerationExceed30() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 26 ; count++) {
            bike.setAccelerate();
        }
        assertEquals(31, bike.getAcceleration());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void TestIfTheTheCurrentGearWillChangeWhenAccelerationExceed40() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 30; count++) {
            bike.setAccelerate();
        }
        assertEquals(43, bike.getAcceleration());
        assertEquals(4, bike.getGear());

    }

    @Test
    public void TestIfTheTheCurrentGearWillChangeWhenAccelerationExceed41() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 50; count++) {
            bike.setAccelerate();
        }
        assertEquals(123, bike.getAcceleration());
        assertEquals(4, bike.getGear());
    }

    @Test
    public void TestIfTheAccerationWillStopIncreasingInGear$WhenTheSpeedExceeds123() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 1100; count++) {
            bike.setAccelerate();
        }
        assertEquals(123, bike.getAcceleration());
        assertEquals(4, bike.getGear());
    }



@Test
    public void TestIfDecelerationDecreaseWithCurrentGear1() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        bike.setAccelerate();
        bike.setAccelerate();
        bike.setDeceleration();

        assertEquals(1,bike.getAcceleration());
        assertEquals(1, bike.getGear());
}



@Test
    public void TestIfCurrentGearChangesWhenDecelerationDecreaseToBelow50() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 50; count++) {
            bike.setAccelerate();
        }
        for (int count = 0; count < 20; count++) {
            bike.setDeceleration();
        }
        assertEquals(43, bike.getAcceleration());
        assertEquals(4, bike.getGear());


}
@Test
    public void TestIfCurrentGearChangesWhenDecelerationDecreaseTo40() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 50; count++) {
            bike.setAccelerate();
        }
        for (int count = 0; count < 23; count++) {
            bike.setDeceleration();
        }
        assertEquals(33, bike.getAcceleration());
        assertEquals(3, bike.getGear());
}
    @Test
    public void TestIfCurrentGearChangesWhenDecelerationDecreaseTo30() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 50; count++) {
            bike.setAccelerate();
        }
        for  (int count = 0; count < 26; count++) {
            bike.setDeceleration();
        }
        assertEquals(26, bike.getAcceleration());
        assertEquals(2, bike.getGear());
    }
@Test
    public void TestIfCurrentGearChangesWhenDecelerationDecreaseTo20() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        for (int count = 0; count < 50; count++) {
            bike.setAccelerate();
        }
        for (int count = 0; count < 30; count++) {
            bike.setDeceleration();
        }
        assertEquals(19, bike.getAcceleration());
        assertEquals(1, bike.getGear());
}

@Test
    public void TestIfCurrentGearChangesWhenDecelerationDecreaseTo0() {
        Bike bike = new Bike();
        bike.start();
        bike.setGear();
        bike.setAccelerate();
        bike.setDeceleration();

        assertEquals(0,bike.getAcceleration());
        assertEquals(0, bike.getGear());
}

}