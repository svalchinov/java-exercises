package general;

import general.MissingElement;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingElementTest {

    private MissingElement missingElement;

    @Before
    public void setup(){
        this.missingElement = new MissingElement();
    }

    @Test
    public void solution() {

        int[] arr = {2, 3, 1, 5};

        int result = missingElement.solution(arr);

        assertEquals(4, result);
    }

    @Test
    public void solution_single() {

        int[] arr = {1};

        int result = missingElement.solution(arr);

        assertEquals(2, result);
    }

    @Test
    public void solution_empty() {

        int[] arr = {};

        int result = missingElement.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_missingFirst() {

        int[] arr = {2, 4, 3, 5};

        int result = missingElement.solution(arr);

        assertEquals(1, result);
    }

    @Test
    public void solution_missingLast() {

        int[] arr = {1, 2, 3, 4, 5};

        int result = missingElement.solution(arr);

        assertEquals(6, result);
    }


//    @Test
//    public void solution_large() {
//
//        int[] arr = {1, 99997, 99999, 100000};
//
//        int result = missingElement.solution(arr);
//
//        assertEquals(99998, result);
//    }
}