package practice;

import java.util.Arrays;
import java.util.List;

public class FindMaximumInAList {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);

        System.out.println("The maximum number in the list is: " + max);
    }
}
