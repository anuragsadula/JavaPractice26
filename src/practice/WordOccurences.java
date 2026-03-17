package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurences {

    public static void main(String[] args){

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> wordCount =words.stream()
                .collect(Collectors.groupingBy(w->w, Collectors.counting()));

        System.out.println("Word occurrences: ");
        System.out.println(wordCount);
    }
}
