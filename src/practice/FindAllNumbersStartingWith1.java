package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllNumbersStartingWith1 {

    public static void main(String[] args){

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList.stream()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(s->System.out.print(s+" "));

        System.out.println();

        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; */

        int[] arr = {10,15,8,49,25,98,32};

        Arrays.stream(arr).boxed()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(s->System.out.print(s+" "));
    }
}
