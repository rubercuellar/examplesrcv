package org.fundacionjala.coding.Ruber.Others;

/**
 * Class to reverse String
 */
public final class ReverseString {

    /**
     * Constructor.
     */
    private ReverseString() {
    }

    public static String reverse(final String word) {
        String reverseWord = "";
        for(int i = word.length()-1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }
        return reverseWord;
    }

    public static int countVocals(final String word, final char[] vocals) {
        int counter = 0;
        for(char new_val : word.toCharArray()) {
            for(char vocal : vocals) {
                if(new_val == vocal) {
                    counter++;
                }
            }

        }
        return counter;

    }

    public static Integer validate(final String word) {
        return (word.length() > 0 ? word.length() : null);
    }


}
