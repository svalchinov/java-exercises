package general;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayEquilibriumTest {

    private ArrayEquilibrium solution;

    @Before
    public void setUp() {
        this.solution = new ArrayEquilibrium();
    }

    @Test
    public void solution(){

        // given
        int[] arr = {-1, 3, -4, 5, 1, -6, 2, 1};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(1, result);
    }

    @Test
    public void solution_first(){

        // given
        int[] arr = {5, 3, -3};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(0, result);
    }

    @Test
    public void solution_last(){

        // given
        int[] arr = {-4, 1, 5, -2, -3};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(4, result);
    }

    @Test
    public void solution_extremeNegative(){
        // given
        int[] arr = {-400000000, 100000000, 500000000, -200000000, -300000000};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(4, result);
    }

    @Test
    public void solution_triples(){
        // given
        int[] arr = {-1, 0, 1};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(-1, result);
    }

}