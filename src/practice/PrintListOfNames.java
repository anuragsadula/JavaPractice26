package practice;

import java.util.Arrays;
import java.util.List;

public class PrintListOfNames {

    public static void main(String[] args){

        List<String> list = Arrays.asList("Alice","Bob","Charlie");
        
        list.forEach(name->System.out.print(name+" "));
    }
}