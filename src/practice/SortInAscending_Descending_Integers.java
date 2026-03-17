package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortInAscending_Descending_Integers {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        List<Integer> sortedAscending = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> sortedDescending = numbers.stream()
                .sorted((a,b)->b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Sorted in ascending order: " + sortedAscending);
        System.out.println("Sorted in descending order: " + sortedDescending);
    }
}
