package practice;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Collections.max;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "sadula sai anurag";

        Map<Character, Long> charFrequency = str.chars()
                .filter(ch -> ch != ' ')
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Character frequency: ");

        charFrequency.forEach((ch, frequency) -> {
            System.out.println("'" + ch + "'->" + frequency);
        });

        System.out.println();

        Optional<Map.Entry<Character, Long>> maxEntry = charFrequency.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (maxEntry.isPresent()) {
            System.out.println("Most frequent character: '" + maxEntry.get().getKey() + "' with frequency: " + maxEntry.get().getValue());
        } else {
            System.out.println("No characters found.");
        }
    }
}
