package general;

public class ReverseString {

    public String reverseString(String string) {
        StringBuilder output = new StringBuilder();
        for (int i = string.length(); i > 0; i--) {
            output.append(string.charAt(i - 1));
        }
        return output.toString();
    }
}
