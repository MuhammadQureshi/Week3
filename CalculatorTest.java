//import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

//import org.junit.jupiter.api.Test;

public class CalculatorTest {
//setup
    Calculator c1 = new Calculator();

@Test
    public void testAddition(){
        //expected values
        assertEquals(25, c1.addition(12, 13));

    }
@Test
    public void testSubtraction(){
        assertEquals(-1, c1.subtraction(12, 13));
    }
@Test
    public void testMultiplication(){
        assertEquals(36, c1.multiplication(12, 3));
    }
@Test
    public void testRemainder(){
        assertEquals(0, c1.remainder(120, 10));
    }
    
}
