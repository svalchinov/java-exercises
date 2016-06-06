import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    private ReverseString reverseString;

    @Before
    public void setup() {
        this.reverseString = new ReverseString();
    }

    @Test
    public void reverseString() {

        // when
        String result = reverseString.reverseString("hello");

        // then
        assertEquals("olleh", result);
    }
}