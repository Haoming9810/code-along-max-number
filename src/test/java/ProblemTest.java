import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProblemTest {

    // Example test
    // DO NOT CHANGE
    @Test
    public void testBinarySearch() {
        int[][] inputs = {
                {},
                {3},
                {1, 1},
                {1, 3},
                {3, 3},
                {1, 2, 3},
                {3, 2, 1},
                {3, 3, 3},
                {20, 7, 9, -2, -3},
        };
        int[] answer = {-1, 0, 0, 1, 0, 2, 0, 0, 0};

        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            int actual = Problem.findMax(inputs[i]);

            int expected = answer[i];
            assertEquals(expected, actual);
        }
    }
}
