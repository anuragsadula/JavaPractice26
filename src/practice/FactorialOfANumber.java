package practice;

import java.util.stream.IntStream;

public class FactorialOfANumber {

    public static void main(String[] args){

        int number = 5;

        int factorialOfGivenNumber = IntStream.rangeClosed(1,number)
                .reduce(1,(a,b) -> a * b);

        System.out.println(factorialOfGivenNumber);
    }
}
