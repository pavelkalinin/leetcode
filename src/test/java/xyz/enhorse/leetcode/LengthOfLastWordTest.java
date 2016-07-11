package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 16.11.2015.
 */
public class LengthOfLastWordTest extends TestCase {

    public void testEmpty() throws Exception {
        assertEquals(0, new LengthOfLastWord().lengthOfLastWord(""));
    }

    public void testNull() throws Exception {
        assertEquals(0, new LengthOfLastWord().lengthOfLastWord(null));
    }

    public void testOneWord() throws Exception {
        assertEquals(4, new LengthOfLastWord().lengthOfLastWord("word"));
    }

    public void testManyWords() throws Exception {
        assertEquals(5, new LengthOfLastWord().lengthOfLastWord("many words"));
    }

    public void testOneWordAndSpace() throws Exception {
        assertEquals(4, new LengthOfLastWord().lengthOfLastWord("word "));
    }

    public void testSpaceAndOneWord() throws Exception {
        assertEquals(4, new LengthOfLastWord().lengthOfLastWord(" word"));
    }

    public void testManyWordsManySpaces() throws Exception {
        assertEquals(5, new LengthOfLastWord().lengthOfLastWord("many   words  "));
    }
}