package practice;

@FunctionalInterface
interface TwoSum{

    public abstract int twoSum(int a, int b);
}

public class FunctionalInterfaceExample {

    public static void main(String[] args){

        TwoSum sum = (a,b)->{
            return a+b;
        };

        System.out.println("Sum of given two numbers is: "+sum.twoSum(5,10));
    }
}
