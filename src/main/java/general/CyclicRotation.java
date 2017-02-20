package general;

public class CyclicRotation {

    public int[] solution(int[] array, long index) {
        for (int i = 0; i < index; i++) {
            array = shiftByOne(array);
        }
        return array;
    }

    private int[] shiftByOne(int[] array) {

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i+1 == array.length) {
                result[0] = array[i];
            } else {
                result[i + 1] = array[i];
            }
        }

        return result;
    }
}
