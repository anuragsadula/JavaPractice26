package practice;

public class TypeCastingExample {

    public static void main(String[] args){

        // Implicit type casting (widening)
        int num = 100;
        double doubleNum = num; // int to double
        System.out.println("Implicit type casting (int to double): " + doubleNum);

        // Explicit type casting (narrowing)
        double pi = 3.14159;
        int intPi = (int) pi; // double to int
        System.out.println("Explicit type casting (double to int): " + intPi);
    }
}
