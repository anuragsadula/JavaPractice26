package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Even numbers in the list: ");

        List<Integer> evenNumbers = numbers.stream()
                .filter(number->number%2==0)
                .collect(Collectors.toList());

        evenNumbers.forEach(evenNumber->System.out.print(evenNumber+" "));
    }
}
