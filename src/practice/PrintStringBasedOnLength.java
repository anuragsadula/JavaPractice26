package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintStringBasedOnLength {

    public static void main(String[] args){

        List<String> list = Arrays.asList("Java","SpringBoot","Microservices","SQL","Azure","C","C++","C#");

        list.stream()
        .sorted(Comparator.comparingInt(String::length))
        .forEach(s->System.out.println(s));
    }
}
