package general;

public class BinaryGap {

    public int solution(int number) {
        int total = 0;
        int count = 0;

        String binary = Integer.toBinaryString(number);

        for (int i = 0; i < binary.length(); i++) {
            String ch = String.valueOf(binary.charAt(i));

            if (ch.equals("0")) {
                count++;
            } else {
                total = count > total ? count : total;
                count = 0;
            }
            number = number / 10;
        }

        return total;
    }
}
