package practice;
import java.util.*;
import java.util.stream.*;
public class HighestFrequencyCharacter{

	public static void main(String[] args){

		String str = "Hi My name is Anurag";

		Map<Character,Long>grouped = str.chars()
		.mapToObj(c->(char)c)
		.filter(c->c!=' ')
		.collect(Collectors.groupingBy(c->c, Collectors.counting()));

		System.out.println(grouped);

		Optional<Map.Entry<Character,Long>>maxEntry = grouped.entrySet().stream()
													.max(Map.Entry.comparingByValue());

		System.out.println("Most occured Character is: '"+maxEntry.get().getKey()+"' with Frequency: "+maxEntry.get().getValue());
	}
}