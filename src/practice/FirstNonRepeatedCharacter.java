package practice;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args){

        String input = "thfdljklht";

        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c->input.indexOf(c) == input.lastIndexOf(c))
                .findFirst()
                .orElse(null);

        System.out.print("The first non-repeated character in the string \"" + input + "\" is: ");

        System.out.println(result);
    }
}
