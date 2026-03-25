package practice;
import java.util.*;
import java.util.stream.*;
public class HighestFrequencyCharacter{

	public static void main(String[] args){

		String str = "Sadula Siri Chandana";

		Map<Character,Long>grouped = str.chars()
		.map(Character::toUpperCase)
		.mapToObj(c->(char)c)
		.filter(c->c!=' ')
		.collect(Collectors.groupingBy(c->c, Collectors.counting()));


		Optional<Map.Entry<Character,Long>>maxEntry = grouped.entrySet().stream()
		.max(Map.Entry.comparingByValue());

		System.out.println("Most occured Character is: '"+maxEntry.get().getKey()+"' with Frequency: "+maxEntry.get().getValue());
	}
}