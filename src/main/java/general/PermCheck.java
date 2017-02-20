package general;

import java.util.Arrays;

/**
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 * <p/>
 * For example, given array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * the function should return 1.
 * <p/>
 * Given array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * the function should return 0.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 */
public class PermCheck {

    public int solution(int[] array) {

        Arrays.sort(array);
        int current = 0;

        for (int value : array) {

            if (value != current + 1) {
                return 0;
            }

            current = value;
        }

        return 1;
    }
}