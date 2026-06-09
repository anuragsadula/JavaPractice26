package interview_questions;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.*;
public class AltimetrikInterview {

    public static void main(String[] args){

        String str = "welcome to programming";

        Map<Character,Long> grouped = str.chars()
        .mapToObj(c->(char)c)
        .filter(c->c!=' ')
        .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(grouped);

        Map<Character,Long>sortedMap = grouped.entrySet().stream()
        .sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (oldvalue, newValue)->oldvalue,
            LinkedHashMap::new
        ));
    
        System.out.println(sortedMap);
    }
}
