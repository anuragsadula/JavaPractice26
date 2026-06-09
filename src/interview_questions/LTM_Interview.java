package interview_questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LTM_Interview {

    public static void main(String[] args) {
        
    // Arjun 25000
    // Kiran 30000
    // Surya 25000
    // Srini 18000
    // Manoj 30000
    
//     25000 arjun Surya
// 30000 Manoj Kiran
// 18000 Srini

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Arjun", 25000);
        map.put("Kiran",30000);
        map.put("Surya",25000);
        map.put("Srini",18000);
        map.put("Manoj",30000);

        Map<Integer,List<Map.Entry<String,Integer>>> newMap = map.entrySet().stream()
        .collect(Collectors.groupingBy(e->e.getValue()));


        
    }
}
