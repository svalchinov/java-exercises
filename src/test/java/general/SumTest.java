package general;

import general.Sum;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class SumTest {

    private Sum solution;

    @Before
    public void setUp() {
        this.solution = new Sum();
    }

    @Test
    public void test() {

//        int[] a = new int[]{5, 1, 2, 3, 4, 5};
        String source = "Hilary\nJames\nSarah Fred\nSarah Paul\nFred Hilary\nFred Jenny\nJenny James";
        Scanner scanner = new Scanner(source);

//        System.out.print("Singapore");
//        System.out.print("Edinburgh");
//        System.out.print("Edinburgh");
//        System.out.print("Barcelona");
//        System.out.print("Barcelona");
//        System.out.print("Barcelona");

//        Scanner in = new Scanner("Singapore" +
//                "Singapore" +
//                "Singapore" +
//                "Barcelona" +
//                "Barcelona" +
//                "Edinburgh");
        Sum.solution(5, scanner);

//        assertEquals(15, result);
    }

}