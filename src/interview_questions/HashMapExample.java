package interview_questions;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();

        HashMap<String, String> map2 = new HashMap<>();

        map1.put(1,"java");
        map1.put(3, "jack");
        map1.put(7,"new");

        map2.put("java","Good");
        map2.put("jack","Medium");
        map2.put("new","Bad");

        Set<Integer> keys = map1.keySet();

        //System.out.println(keys);

        HashMap<Integer,String> map3 = new HashMap<>();

        for(Integer i:keys){

            if(map2.containsKey(map1.get(i))){

                map3.put(i,map2.get(map1.get(i)));
            }
        }

        // Map<Integer,String>map4 =  map1.entrySet().stream()
        //         .filter(e -> e.getValue().equals(map2.get(e.getKey())))
        //          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map3);

    }
}
