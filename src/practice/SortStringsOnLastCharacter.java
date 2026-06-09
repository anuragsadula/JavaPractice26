package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsOnLastCharacter {

    public static void main(String[] args){

        List<String> list = Arrays.asList("Orange", "Banana","Apple", "Mango", "Musk Melon");

        List<String>sortedList = list.stream()
        .sorted(Comparator.comparingInt(s->s.charAt(s.length()-1)))
        .collect(Collectors.toList());

        System.out.println(sortedList);
    } 
}
