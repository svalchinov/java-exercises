package general;

public class ArrayEquilibrium {

    public int solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int right = 0;
            int left = 0;
            for(int r = i+1; r < array.length; r++) {
                right += array[r];
            }

            for(int l = 0; l < i; l++) {
                left += array[l];
            }

            int current = array[i];
            if ((array[0] == current || array[array.length-1] == current) && (left+right) == 0) {
                return i;
            }
            if(left == right) {
                return i;
            }
        }

        return -1;
    }
}
