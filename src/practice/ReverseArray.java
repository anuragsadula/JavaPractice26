package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));

        // Reverse using Java 8 Streams
        int[] reversed = IntStream.range(0, array.length)
                .map(i -> array[array.length - 1 - i])
                .toArray();

        System.out.println(Arrays.toString(reversed));
    }
}
