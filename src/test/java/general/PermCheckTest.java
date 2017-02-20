package general;

import general.PermCheck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {

    private PermCheck permCheck;

    @Before
    public void setup() {
        this.permCheck = new PermCheck();
    }

    @Test
    public void solution_false() {

        int[] arr = {2, 3, 1, 5};

        int result = permCheck.solution(arr);

        assertEquals(0, result);
    }

    @Test
    public void solution_true() {

        int[] arr = {2, 3, 1, 4};

        int result = permCheck.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_single_one() {
        int[] arr = {1};

        int result = permCheck.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_single_two() {

        int[] arr = {2};

        int result = permCheck.solution(arr);

        assertEquals(0, result);
    }
}