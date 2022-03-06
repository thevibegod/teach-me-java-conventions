import com.thevibegod.powerpackage.PowerFinder;
import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOne() {
        assert PowerFinder.of(1, 1) == 1;
    }

    @Test
    public void twoRaisedToOne() {
        assert PowerFinder.of(2, 1) == 2;
    }

    @Test
    public void twoRaisedToTwo() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwo() {
        assert PowerFinder.of(3, 2) == 3 * 3;
    }
}
