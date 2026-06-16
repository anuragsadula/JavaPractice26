package practice;

import java.util.Scanner;

class CustomException extends RuntimeException{

    public CustomException(String message){
        super(message);
    }
}
public class ValidateInput {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        try{
            validateInput(n);
        } catch(CustomException e){
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
        finally{
            input.close();
        }
    }

    public static void validateInput(int n) throws CustomException{

        if(n<0){
            throw new CustomException("Input value is negative");
        }

        System.out.println("Valid input: "+n);
    }
}
