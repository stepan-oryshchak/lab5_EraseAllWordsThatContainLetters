package ua.lviv.iot.algo.part1.lab5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EraseAllWordsThatContainLettersTest {

    @Test
    public void testEraseWords() {
        EraseAllWordsThatContainLetters eraser = new EraseAllWordsThatContainLetters("[AaOrK]");
        String input = "If wandered relation no surprise of screened doubtful. Overcame no insisted ye of trifling husbands. Might am order hours on found.";
        String expectedOutput = "If no of doubtful. no insisted ye of Might on found.";
        String actualOutput = eraser.eraseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testEraseWordsWithEmptyInput() {
        EraseAllWordsThatContainLetters eraser = new EraseAllWordsThatContainLetters("[AaOrK]");
        String input = "";
        String expectedOutput = "";
        String actualOutput = eraser.eraseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testEraseWordsWithNoMatch() {
        EraseAllWordsThatContainLetters eraser = new EraseAllWordsThatContainLetters("[Zz]");
        String input = "quick brown fox jumps over lazy dog";
        String expectedOutput = "quick brown fox jumps over dog";
        String actualOutput = eraser.eraseWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

}