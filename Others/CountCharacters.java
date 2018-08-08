package org.fundacionjala.coding.Ruber.Others;

/**
 * Class to count characterss
 */
public final class CountCharacters {

    /**
     * Private Constructor
     */
    private CountCharacters() {
    }

    public static int countChars(final String word) {
        return word.length();

    }

    public static int countDefinedChar(final String word, final char character) {
        int counter = 0;
        for (Character one_char : word.toCharArray()) {
            if(one_char.equals(character)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String args[]) {
        //System.out.println(CountCharacters.countChars(""));
        System.out.println(CountCharacters.countDefinedChar("ruberrr", 'r'));
    }
}
