package general;

import java.util.Arrays;

/**
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.
 * <p/>
 * For example, given:
 * <p/>
 * A[0] = 1
 * A[1] = 3
 * A[2] = 6
 * A[3] = 4
 * A[4] = 1
 * A[5] = 2
 * <p/>
 * the function should return 5.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */
public class MissingInteger {

    public int solution(int[] arr) {

        Arrays.sort(arr);
        int minValue = 1;

        for (int value : arr) {
            if (value == minValue) {
                minValue++;
            }
        }

        return minValue;
    }
}