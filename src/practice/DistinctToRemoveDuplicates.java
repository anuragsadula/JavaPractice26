package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctToRemoveDuplicates {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct numbers: " + distinctNumbers);
    }
}
