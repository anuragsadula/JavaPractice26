package practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args){

        String input = "geeksforgeeks";

        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c->input.indexOf(c) == input.lastIndexOf(c))
                .findFirst()
                .orElse(null);

        System.out.println("The first non-repeated character in the string \"" + input + "\" is: "+result);

        Character character = input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(character);
    }
}