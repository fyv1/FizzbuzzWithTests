import junit.framework.*;
import org.junit.Test;

public class FizzBuzzTest extends TestCase {

    private Counter counter;

    protected void setUp() {
        counter = new Counter();
    }

    @Test
    public void testIfNumberIsDividedByThreePrintFizz() {
        assertEquals(counter.print(3), "Fizz");
    }

    @Test
    public void testIfNumberIsDividedByFivePrintBuzz() {
        assertEquals(counter.print(5), "Buzz");
    }

    @Test
    public void testIfNumberIsDividedByThreeAndFivePrintFizzBuzz() {
        assertEquals(counter.print(15), "FizzBuzz");
    }

    @Test
    public void testIfNumberIsNotDividePrintTheNumber() {
        assertEquals(counter.print(1), "1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfNumberIsLowerOrEqualZeroThrowException() {
        counter.print(0);
    }


}
