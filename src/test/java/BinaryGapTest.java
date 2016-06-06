import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setup(){
        this.binaryGap = new BinaryGap();
    }

    @Test
    public void solution_10000010001(){

        // when
        int result = binaryGap.solution(1041);

        // then
        assertEquals(5, result);
    }

    @Test
    public void solution_110010(){

        // when
        int result = binaryGap.solution(50);

        // then
        assertEquals(2, result);
    }

    @Test
    public void solution_111(){

        // when
        int result = binaryGap.solution(7);

        // then
        assertEquals(0, result);
    }
}