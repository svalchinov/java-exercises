package general;

import general.MaxCounters;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxCountersTest {

    private MaxCounters maxCounters;

    @Before
    public void setup() {
        this.maxCounters = new MaxCounters();
    }

    @Test
    public void solution() {

        int[] arr = {3, 4, 4, 6, 1, 4, 4};
        int[] expected = {3, 2, 2, 4, 2};

        int[] result = maxCounters.solution(5, arr);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}