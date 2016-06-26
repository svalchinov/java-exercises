public class OddOccurrences {

    public int solution(int[] array) {

        int result = 0;
        for (int anArray : array) {
            // XOR bitwise operator (^)
            // adding any integer to itself even number of times will be 0 (binary: 00000000)
            // the result of adding any integer to itself odd number of times will equal to the initial number itself
            // E.g. 1001 + 1001 = 0000
            // 1001 + 1001 + 1001 = 1001
            result ^= anArray;
        }

        return result;
    }
}
