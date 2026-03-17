package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInAscending_Reverse {

    public static void main(String[] args){

        List<String> words = Arrays.asList("Banana", "Apple", "Cherry", "Date", "Elderberry");

       List<String> sortedInAscending =  words.stream()
                .sorted()
                .collect(Collectors.toList());

       List<String> sortedInReverse =  words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Sorted in ascending order: " + sortedInAscending);
        System.out.println("Sorted in reverse order: " + sortedInReverse);
    }
}
