package general;

/**
 * A non-empty zero-indexed array A of M integers is given. This array represents consecutive operations:
 * <p/>
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * For example, given integer N = 5 and array A such that:
 * <p/>
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * the values of the counters after each consecutive operation will be:
 * <p/>
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 * The goal is to calculate the value of every counter after all operations.
 * <p/>
 * For example, given:
 * <p/>
 * A[0] = 3
 * A[1] = 4
 * A[2] = 4
 * A[3] = 6
 * A[4] = 1
 * A[5] = 4
 * A[6] = 4
 * the function should return [3, 2, 2, 4, 2], as explained above.
 *
 *
 * 100%, 80%
 */
public class MaxCounters {

    public int[] solution(int n, int[] array) {

        int[] counters = new int[n];
        int maxCounter = 0;
        final int counterNumberMax = n + 1;

        for (int value : array) {

            if (value == counterNumberMax) {

                for (int j = 0; j < counters.length; j++) {
                    counters[j] = maxCounter;
                }

            } else {

                final int index = value - 1;
                counters[index]++;
                final int counter = counters[index];

                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            }
        }

        return counters;
    }
}