package practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateTillN {

    public static void main(String[] args){

        List<Integer> numbers = Stream.iterate(1,n->n+1)
                .limit(10)
                .collect(Collectors.toList());

        IntStream.rangeClosed(1, 10)
        .forEach(i->System.out.print(i+" "));

        System.out.println();

        System.out.println(numbers);
    }
}
