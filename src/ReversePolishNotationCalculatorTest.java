import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldReturnSum_15() {
        assertEquals(15, reversePolishNotationCalculator.calculatePolishNotation("7 8 +"));
    }

    @Test
    public void shouldAvoidSpacesAndReturnSum_9() {
        assertEquals(9, reversePolishNotationCalculator.calculatePolishNotation("    3    6   +   "));
    }

    @Test
    public void shouldReturnDifference_minus1() {
        assertEquals(-1, reversePolishNotationCalculator.calculatePolishNotation("8 9 -"));
    }

    @Test
    public void shouldReturnMltplctnResult_20() {
        assertEquals(20, reversePolishNotationCalculator.calculatePolishNotation("5 4 *"));
    }
}
