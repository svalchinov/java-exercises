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
    public void uniquePathsWithObstacles_3x2() {

        // when
        int result = uniquePaths.uniquePathsWithObstacles(3, 2);

        // then
        assertEquals(3, result);
    }

    @Test
    public void uniquePathsWithObstacles_3x3() {

        // when
        int result = uniquePaths.uniquePathsWithObstacles(3, 3);

        // then
        assertEquals(6, result);
    }

    @Test
    public void uniquePathsWithObstacles_5x3() {

        // when
        int result = uniquePaths.uniquePathsWithObstacles(5, 3);

        // then
        assertEquals(15, result);
    }

    @Test
    public void uniquePathsWithObstacles_50x50() {

        // when
        int result = uniquePaths.uniquePathsWithObstacles(50, 50);

        // then
        assertEquals(15, result);
    }
}