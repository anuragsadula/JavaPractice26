package practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BalancedParenthesis {

    public static void main(String[] args) {

        String str = "[{()}][]";

        Map<Character,Long> grouped = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Check if opening brackets equal closing brackets for each type
        boolean result = grouped.getOrDefault('(', 0L).equals(grouped.getOrDefault(')', 0L)) &&
                         grouped.getOrDefault('{', 0L).equals(grouped.getOrDefault('}', 0L)) &&
                         grouped.getOrDefault('[', 0L).equals(grouped.getOrDefault(']', 0L));

        if(result){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}