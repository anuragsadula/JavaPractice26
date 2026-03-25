package practice;

public class ReverseAStringInJava8 {

    public static void main(String[] args){

        String input = "I am a Java Developer";

        String reversed = input.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);

        System.out.println("Reversed String: " + reversed);
    }
}
