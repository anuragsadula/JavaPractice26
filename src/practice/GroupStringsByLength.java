package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {

    public static void main(String[] args){

        List<String> words = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eve");

        System.out.println("Grouping strings by their length: ");

        Map<Integer,List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.print(groupedByLength);
    }
}
