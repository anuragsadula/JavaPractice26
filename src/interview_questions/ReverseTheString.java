package interview_questions;

public class ReverseTheString {

    public static void main(String[] args){

        String input = "I am a Java Developer";

        System.out.println("Given input is: "+ input);

        String[] strArray = input.split(" ");

        StringBuilder reversedString = new StringBuilder();

        for(int i = strArray.length - 1; i >= 0; i--){
            reversedString.append(strArray[i]).append(" ");
        }

        System.out.println("Reversed String: " + reversedString.toString().trim());
    }
}
