package specific;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game solution;

    @Before
    public void setup() {
        this.solution = new Game();
    }

    /**
     * if 267 is between 167 and 268
     * if 168 is between 167 and 268
     * if 466 is between 269 and 469
     *
     * A = 66
     * B = 67
     * C = 68
     * D = 69
     *
     * 167 and 268 = rows 1, 2 columns 67, 68
     * 269 and 469 = rows 2, 3, 4 column - 69, 69, 69
     *
     */

    @Test
    public void solution() {

        String result = solution.solution(4, "1B 2C, 2D 4D", "2B 2D 3D 4D 4A");

        assertEquals("1,1", result);
    }

    @Test
    public void solution_2() {

        String result = solution.solution(4, "1A 2A, 12A 12A", "12A");

        assertEquals("1,0", result);
    }

    @Test
    public void solution_3() {

        String result = solution.solution(6, "1A 4A, 6A 6B, 5B 5B", "6B 6A 1A 2A 3A 4A 5B");

        assertEquals("3,0", result);
    }

}