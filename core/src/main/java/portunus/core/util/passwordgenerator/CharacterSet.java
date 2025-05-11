package portunus.core.util.passwordgenerator;

/**
 * An enum specifying differen character sets.
 */
public enum CharacterSet {
    /**
     * All upper case letters.
     */
    UPPER_CASE("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),

    /**
     * All lower case letters.
     */
    LOWER_CASE("abcdefghijklmnopqrstuvwxyz"),

    /**
     * All digits.
     */
    DIGITS("0123456789"),

    /**
     * The minus sign '-'.
     */
    MINUS("-"),

    /**
     * The underscore sign '_'.
     */
    UNDERSCORE("_"),

    /**
     * The space sign ' '.
     */
    SPACE(" "),

    /**
     * A selected set of special characters.
     */
    SPECIAL("!$%&");

    private final String characters;

    private CharacterSet(String characters) {
        this.characters = characters;
    }

    /**
     * Returns a string that contains all characters from this character set.
     * 
     * @return all characters as string
     */
    public String getCharacters() {
        return characters;
    }

    /**
     * Returns whether the provided character is part of this character set.
     * 
     * @return true iff this character set contains the character
     */
    public boolean contains(char character) {
        return characters.indexOf(character) >= 0;
    }
}
