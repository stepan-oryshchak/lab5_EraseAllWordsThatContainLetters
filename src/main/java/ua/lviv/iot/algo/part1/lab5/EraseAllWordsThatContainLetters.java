package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString


public class EraseAllWordsThatContainLetters {

    private Pattern pattern;
    public EraseAllWordsThatContainLetters(String regex) {
        this.pattern = Pattern.compile(regex);
    }
    public String eraseWords(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (!matcher.find()) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "If wandered relation no surprise of screened doubtful. Overcame no insisted ye of trifling husbands. Might am order hours on found.";
        EraseAllWordsThatContainLetters eraser = new EraseAllWordsThatContainLetters("[AaOrK]");
        String output = eraser.eraseWords(input);
        System.out.println(output); // Output: quick brown jumps over lazy
    }
}
