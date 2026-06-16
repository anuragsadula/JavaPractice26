package practice;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintCharacterFrequency {

    public static void main(String[] args) {

        String str = "aaabbc";

         Map<Character,Long> grouped = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

         grouped.entrySet()
                 .forEach(entry->System.out.print(entry.getValue()+""+entry.getKey()));
    }
}
