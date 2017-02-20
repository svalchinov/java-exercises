package general;

import general.CyclicRotation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @Before
    public void setup() throws Exception {
        this.cyclicRotation = new CyclicRotation();
    }

    @Test
    public void solution_shiftByOne() throws Exception {

        // given
        int[] arr = {3,8,9,7,6};

        // when
        int[] result = cyclicRotation.solution(arr, 1);

        // then
        assertEquals(6, result[0]);
        assertEquals(3, result[1]);
        assertEquals(8, result[2]);
        assertEquals(9, result[3]);
        assertEquals(7, result[4]);
    }

    @Test
    public void solution_shiftByTwo() throws Exception {

        // given
        int[] arr = {3,8,9,7,6};

        // when
        int[] result = cyclicRotation.solution(arr, 2);

        // then
        assertEquals(7, result[0]);
        assertEquals(6, result[1]);
        assertEquals(3, result[2]);
        assertEquals(8, result[3]);
        assertEquals(9, result[4]);
    }

    @Test
    public void solution_shiftByFive() throws Exception {

        // given
        int[] arr = {3,8,9,7,6};

        // when
        int[] result = cyclicRotation.solution(arr, 5);

        // then
        assertEquals(3, result[0]);
        assertEquals(8, result[1]);
        assertEquals(9, result[2]);
        assertEquals(7, result[3]);
        assertEquals(6, result[4]);
    }

    @Test
    public void solution_shiftByHundred() throws Exception {

        // given
        int[] arr = {3,8,9,7,6};

        // when
        int[] result = cyclicRotation.solution(arr, 100);

        // then
        assertEquals(3, result[0]);
        assertEquals(8, result[1]);
        assertEquals(9, result[2]);
        assertEquals(7, result[3]);
        assertEquals(6, result[4]);
    }

    @Test
    public void solution_shiftByThousand() throws Exception {

        // given
        int[] arr = {3,8,9,7,6};

        // when
        int[] result = cyclicRotation.solution(arr, 1000);

        // then
        assertEquals(3, result[0]);
        assertEquals(8, result[1]);
        assertEquals(9, result[2]);
        assertEquals(7, result[3]);
        assertEquals(6, result[4]);
    }
}