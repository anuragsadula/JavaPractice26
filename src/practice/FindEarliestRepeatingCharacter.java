package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEarliestRepeatingCharacter {

    public static void main(String[] args){

        String str = "geeksforgeeks";

        Set<Character> set = new HashSet<>();

        Character earliestRepeatedCharacter = str.chars()
                .mapToObj(c->(char)c)
                .filter(ch->!set.add(ch))
                .findFirst()
                .orElse(null);

        System.out.println(earliestRepeatedCharacter);

        Character character = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(character);
    }
}
