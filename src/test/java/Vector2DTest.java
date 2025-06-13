import Alishev.Vector2D;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// https://youtu.be/ebev_0vDSdo?si=AjazgnZF1rq9Eqo5
// https://youtu.be/29jYO00euJw?si=2nFyTQ78WZn26LOz


public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLenght() {
        // assertion
        // 1e-9 = 0.000...0001
        Assert.assertEquals(0, v1.lenght(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
