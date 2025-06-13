import Alishev.MyMath;
import org.junit.Test;

public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void ZeroDenominatorShouldThrowException() {
        MyMath.devide(1, 0);
    }
}
