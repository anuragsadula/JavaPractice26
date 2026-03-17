package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithA {

    public static void main(String[] args){

        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");

        List<String> listOfWordsStartsWithA =  words.stream()
                        .filter(word -> word.startsWith("A"))
                        .collect(Collectors.toList());

        System.out.print("Words that start with 'A': ");

        System.out.println(listOfWordsStartsWithA);
    }
}
