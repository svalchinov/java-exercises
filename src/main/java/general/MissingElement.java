package general;

import java.util.Arrays;

/**
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A, returns the value of the missing element.
 * <p/>
 * For example, given array A such that:
 * <p/>
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 */
public class MissingElement {


    public int solution(int[] array) {
        Arrays.sort(array);

        if (array.length == 0) { return 1; }

        if (array[0] != 1) { return 1; }

        for (int i = 0; i < array.length; i++) {

            if(array.length-1 == i) {
               return array[array.length-1] + 1;
            }

            if (array[i + 1] != array[i] + 1) {
                return array[i] + 1;
            }

        }

        return 1;
    }

}