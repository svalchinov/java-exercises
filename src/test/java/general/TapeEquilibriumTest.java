package general;

import general.TapeEquilibrium;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {

    private TapeEquilibrium solution;

    @Before
    public void setUp() {
        this.solution = new TapeEquilibrium();
    }

    @Test
    public void solution() {

        int[] arr = {3, 1, 2, 4, 3};

        int result = solution.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_2() {

        int[] arr = {500, -300};

        int result = solution.solution(arr);

        assertEquals(800, result);
    }


    @Test
    public void solution_negative() {

        int[] arr = {-3, 6, -2};

        int result = solution.solution(arr);

        assertEquals(5, result);
    }

    @Test
    public void solution_negative2() {

        int[] arr = {-3, -1, 2, 8, -3};

        int result = solution.solution(arr);

        assertEquals(7, result);
    }


    @Test
    public void solution_large() {

        int[] arr = {300, 100, 200, 400, 300};

        int result = solution.solution(arr);

        assertEquals(100, result);
    }
}