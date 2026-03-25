package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

    public static void main(String[] args){

        List<String> words = Arrays.asList("alice", "bob");

        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.print("After converting to upper case: ");

        System.out.print(upperCaseWords);
    }
}
