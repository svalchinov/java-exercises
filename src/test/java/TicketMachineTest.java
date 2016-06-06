import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TicketMachineTest {


    private TicketMachine solution;

    @Before
    public void setup() {
        this.solution = new TicketMachine();
    }

    @Test
    public void solution_oneWeeklyTwoSingles() {

        // given
        int[] arr = {1, 2, 4, 5, 7, 29, 30};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(11, result);
    }

    @Test
    public void solution_oneWeeklyTwoSinglesJumbled() {

        // given
        int[] arr = {4, 6, 7, 9, 11, 20, 21};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(11, result);
    }

    @Test
    public void solution_twoWeeklyOneSingle() {

        // given
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17, 30};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(16, result);
    }

    @Test
    public void solution_monthly() {

        // given
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(25, result);
    }

    @Test
    public void solution_oneWeeklyFourSingles() {

        // given
        int[] arr = {2, 4, 6, 7, 9, 15, 16, 26, 27};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(15, result);
    }

    @Test
    public void solution_fiveSingles() {

        // given
        int[] arr = {1, 2, 10, 11, 12};

        // when
        int result = solution.solution(arr);

        // then
        assertEquals(10, result);
    }
}