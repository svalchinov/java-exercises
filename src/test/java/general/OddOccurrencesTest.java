package general;

import general.OddOccurrences;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesTest {

    private OddOccurrences oddOccurrences;

    @Before
    public void setUp() throws Exception {
        this.oddOccurrences = new OddOccurrences();
    }

    @Test
    public void solution_short() throws Exception {

        // given
        int[] array = {9, 3, 9, 3, 9, 7, 9};

        // when
        int result = oddOccurrences.solution(array);

        // then
        assertEquals(7, result);
    }

    @Test
    public void solution_largeNumbers() throws Exception {

        // given
        int[] array = {1000000, 3, 1000000, 7, 1000000, 7, 1000000};

        // when
        int result = oddOccurrences.solution(array);

        // then
        assertEquals(3, result);
    }

    @Test
    public void solution_longLargeNumbers() throws Exception {

        // given
        int[] array = {1000000, 1000000, 900000, 900000, 900000, 1000000, 910000, 1000000, 910000, 1000000, 910000, 1000000, 910000, 1000000, 910000, 1000000, 910000, 1000000, 910000, 1000000, 910000, 1000000, 910000, 910000, 1000000};

        // when
        int result = oddOccurrences.solution(array);

        // then
        assertEquals(900000, result);
    }

    @Test
    public void solution_largest() throws Exception {

        // given
        int[] array = new int[1000000];
        array[500000] = 1000000000;
        array[500001] = 1000000000;
        array[500002] = 1000000000;

        // when
        int result = oddOccurrences.solution(array);

        // then
        assertEquals(1000000000, result);
    }
}