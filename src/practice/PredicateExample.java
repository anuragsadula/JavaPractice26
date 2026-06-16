package practice;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven = i -> i % 2 == 0;

        System.out.println(isEven.test(4));

        Predicate<Integer> isOdd = i -> i % 2 != 0;
        System.out.println(isOdd.test(5));

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello");

         Supplier<Double> randomValue = Math::random;

         System.out.println(randomValue.get());

         Function<Double, Double> add = x -> x + 1.0;

         System.out.println(randomValue.get() + add.apply(randomValue.get()));
    }
}