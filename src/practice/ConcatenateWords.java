package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateWords {

    public static void main(String[] args){

        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");

        String concatenatedSentence = words.stream()
                                    .collect(Collectors.joining(" "));

        System.out.println("Concatenated string: " + concatenatedSentence);
    }
}
