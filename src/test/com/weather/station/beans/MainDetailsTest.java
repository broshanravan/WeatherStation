package test.com.weather.station.beans;

import main.com.weather.station.beans.MainDetail;
import org.junit.jupiter.api.Test;

public class MainDetailsTest {

    @Test
    public void testParametrizedConstructor() {
        MainDetail mainDetailsTest = new MainDetail(22, 10, 27, 12, 5, 56, 2.3);
        assert (mainDetailsTest.getTemperature() == 22);
        assert(mainDetailsTest.getGroundLevel()==56);
    }

}
