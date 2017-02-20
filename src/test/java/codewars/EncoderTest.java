package codewars;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncoderTest {

    @Test
    public void training() {
        assertEquals("(())(((", Encoder.encode("buzzard"));
    }

    @Test
    public void training_capitals() {
        assertEquals(")()())()(()()(", Encoder.encode("Prespecialized"));
    }

    @Test
    public void training_brackets() {
        assertEquals("))))())))", Encoder.encode("   ()(   "));
    }
}