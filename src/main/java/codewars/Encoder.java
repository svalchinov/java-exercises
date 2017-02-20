package codewars;

public class Encoder {

    private static final String OPEN_BRACKET = "(";
    private static final String CLOSED_BRACKET = ")";

    public static String encode(String word) {

        StringBuilder stringBuilder = new StringBuilder();
        final int wordLength = word.length();
        final String wordLowercase = word.toLowerCase();

        for (int i = 0; i < wordLowercase.length(); i++) {

            String character = wordLowercase.substring(i, i + 1);
            boolean isMetMoreThanOnce = wordLength - wordLowercase.replace(character, "").length() > 1;
            stringBuilder.append(isMetMoreThanOnce ? CLOSED_BRACKET : OPEN_BRACKET);
        }

        return stringBuilder.toString();
    }
}
