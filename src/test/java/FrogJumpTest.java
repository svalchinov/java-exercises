import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FrogJumpTest {

    private FrogJump frogJump;

    @Before
    public void setup() throws Exception {
        this.frogJump = new FrogJump();
    }

    @Test
    public void solution() throws Exception {

        // when
        int result = frogJump.solution(10, 85, 30);

        // then
        assertEquals(3, result);

    }

    @Test
    public void solution_smallSteps_largeMargin() throws Exception {

        // when
        int result = frogJump.solution(1, 1000000, 1);

        // then
        assertEquals(999999, result);

    }

    @Test
    public void solution_large() throws Exception {

        // when
        int result = frogJump.solution(100000000, 1000000000, 300000000);

        // then
        assertEquals(3, result);
    }
}