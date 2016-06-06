import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    private UniquePaths uniquePaths;

    @Before
    public void setup() {
        this.uniquePaths = new UniquePaths();
    }

    @Test
    public void uniquePaths_3x2() {

        // when
        int result = uniquePaths.uniquePaths(3, 2);

        // then
        assertEquals(3, result);
    }

    @Test
    public void uniquePaths_3x3() {

        // when
        int result = uniquePaths.uniquePaths(3, 3);

        // then
        assertEquals(6, result);
    }

    @Test
    public void uniquePaths_5x3() {

        // when
        int result = uniquePaths.uniquePaths(5, 3);

        // then
        assertEquals(15, result);
    }
}