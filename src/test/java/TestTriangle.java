import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.Triangle;

public class TestTriangle {
    Triangle triangle = new Triangle();
    @Test
    public void testCalcArea_in_30_35() {
        double actual = triangle.calcArea(30, 35);
        double expected = 525;
        Assert.assertEquals(actual, expected, 0.9);
    }

    @Test
    public void testCalcArea_in_100_125() {
        double actual = triangle.calcArea(100, 125);
        double expected = 6250;
        Assert.assertEquals(actual, expected, 0.9);
    }
}
