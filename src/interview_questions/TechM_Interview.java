package interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface OddOrEven{

    public boolean oddOrEven(int num);
}
public class TechM_Interview {

    public static void main(String[] args){

        OddOrEven result = (int num)->{
            return num%2==0;
        };

        System.out.println(result.oddOrEven(6));
    }
}
