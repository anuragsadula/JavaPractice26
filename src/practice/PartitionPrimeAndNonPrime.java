package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitionPrimeAndNonPrime {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Partitioning prime and non-prime numbers: ");

       Map<Boolean,List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(num-> isPrime(num)));

        System.out.println(partitioned);
    }

    static boolean isPrime(int number){

        if(number<=1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}
