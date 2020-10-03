import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemTest {
    @Test
    public void testFindMaxNumber() {
        int[] input1 = {12, 12, 1, 7, 18, 10, 3};
        int actual = Problem.findMax(input1);
        assertEquals(4, actual);

        int[] input2 = {-9, -2, -1, 7};
        actual = Problem.findMax(input2);
        assertEquals(2, actual);

        int[] input3 = {12, 12, 1, 7, 15, 15, 3};
        actual = Problem.findMax(input3);
        assertEquals(4, actual);

        int[] input4 = {};
        actual = Problem.findMax(input4);
        assertEquals(-1, actual);

        int[] input5 = null;
        actual = Problem.findMax(input5);
        assertEquals(-1, actual);
    }
}
