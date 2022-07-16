import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnOneIfOneIsPassed(){
        final Factorial factorial = new Factorial();
        final int result = factorial.findFactorial(1);
        assertEquals(1,result);

    }
    @Test
    void shouldReturnOneFfZeroIsPassed(){
        final Factorial factorial = new Factorial();
        final int result = factorial.findFactorial(0);
        assertEquals(1,result);
    }

    @Test
    void shouldReturnOneHundredAndTwentyIfFiveIsPassed(){
        final Factorial factorial = new Factorial();
        final int result = factorial.findFactorial(5);
        assertEquals(120,result);
    }
}
