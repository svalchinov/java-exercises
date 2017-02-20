package general;

import general.Staircase;
import org.junit.Before;
import org.junit.Test;


public class StaircaseTest {

    private Staircase solution;

    @Before
    public void setUp() {
        this.solution = new Staircase();
    }

    @Test
    public void solution_6() {
        solution.solution(6);
    }

    @Test
    public void solution_100() {
        solution.solution(100);
    }
}