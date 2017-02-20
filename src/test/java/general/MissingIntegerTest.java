package general;

import general.MissingInteger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {

    private MissingInteger missingInteger;


    @Before
    public void setup() {
        this.missingInteger = new MissingInteger();
    }

    @Test
    public void solution() {

        int[] arr = {-2, 4, -1, 0, 2, 3, 1, 6};

        int result = missingInteger.solution(arr);

        assertEquals(5, result);
    }

    @Test
    public void solution_firstMissing() {

        int[] arr = {0, 3, 4, 2, 5};

        int result = missingInteger.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_multipleMissing() {

        int[] arr = {-2, -1, 0, 1, 2, 4, 5, 7};

        int result = missingInteger.solution(arr);

        assertEquals(3, result);
    }

    @Test
    public void solution_onlyNegative() {

        int[] arr = {-2, -4, -1, -2, -3, -6, -6};

        int result = missingInteger.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution2() {

        int[] arr = {1, 3, 6, 4, 2};

        int result = missingInteger.solution(arr);

        assertEquals(5, result);
    }

    @Test
    public void solution_empty() {

        int[] arr = {};

        int result = missingInteger.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_singleElementOne() {

        int[] arr = {1};

        int result = missingInteger.solution(arr);

        assertEquals(2, result);
    }

    @Test
    public void solution_singleElementTwo() {

        int[] arr = {2};

        int result = missingInteger.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_singleElementNegative() {

        int[] arr = {-1};

        int result = missingInteger.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_twoMissingOneNegativeOnePositive() {

        int[] arr = {2, -2, 0, 4, 1};

        int result = missingInteger.solution(arr);

        assertEquals(3, result);
    }

    @Test
    public void solution_400() {

        int[] arr = new int[401];

        for (int i = 1; i <= 399; i++) {
            arr[i] = i;
        }

        arr[400] = 401;

        int result = missingInteger.solution(arr);

        assertEquals(400, result);
    }

}