package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenNumbers {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer>newList = list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println(newList);

        /* When numbers are given as Array int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Map<Boolean,List<Integer>> map = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(n->n%2==0));

        System.out.print(map);
    }
}
