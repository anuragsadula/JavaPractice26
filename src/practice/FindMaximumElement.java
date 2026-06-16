package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaximumElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int maximumElement = list.stream()
                .max(Integer::compare)
                .get();

        System.out.println(maximumElement);

        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */

        int[] arr = {10,15,8,49,25,98,98,32,15};

        int maxElement = Arrays.stream(arr).boxed()
                .max(Integer::compare)
                .get();

        System.out.println(maxElement);

    }
}
