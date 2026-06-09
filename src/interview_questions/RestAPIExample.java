package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RestAPIExample {

    public static void main(String[] args){

        Integer[] arr = {1, 4, 5, 3, 2};

        List<Integer> list = Arrays.asList(arr);

        list.stream()
        .sorted()
        .forEach(ele->System.out.print(ele+" "));

        System.out.println();

        list.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(ele->System.out.print(ele+" "));
    }
}
