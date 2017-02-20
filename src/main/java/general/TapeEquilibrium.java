package general;

/**
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * We can split this tape in four places:
 * <p/>
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * <p/>
 * <p/>
 * <p/>
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
 */
public class TapeEquilibrium {

    public int solution(int[] array) {

        int leftSide = array[0];
        int rightSide = getTotal(array);
        int lowestDiff = Math.abs(rightSide - leftSide);

        for (int i = 1; i < array.length - 1; i++) {

            leftSide += array[i];
            rightSide -= array[i];

            int difference = Math.abs(rightSide - leftSide);

            if (difference < lowestDiff) {
                lowestDiff = difference;
            }
        }

        return lowestDiff;
    }

    private int getTotal(int[] arr) {

        int total = 0;
        for (int i = 1; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
