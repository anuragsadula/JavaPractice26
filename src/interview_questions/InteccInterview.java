package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InteccInterview {

    //10, 3, 10, 4, 7, 10, 7
    //10, 3, 4, 7

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(3);
        list.add(10);
        list.add(4);
        list.add(7);
        list.add(10);
        list.add(7);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.addAll(list);

        System.out.print(set);

    }
}