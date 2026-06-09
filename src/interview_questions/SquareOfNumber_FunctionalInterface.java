package interview_questions;

@FunctionalInterface
interface SquareOfNumber{

    public abstract int findSquare(int n);
}

public class SquareOfNumber_FunctionalInterface {

    public static void main(String[] args){

        SquareOfNumber obj = (a)->{
            return a*a;
        };

        int result = obj.findSquare(3);

        System.out.println("Square of a Number is: "+result);
    }
}
