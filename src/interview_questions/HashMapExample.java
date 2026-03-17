package interview_questions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

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

        for(int i=0;i<map1.size();i++){

            if(map2.containsKey(String.valueOf(map1.get(i)))){
                //map3.put(map1., map2.get(i));
            }
        }

        Map<Integer,String>map3 =  map1.entrySet().stream()
                .filter(e -> e.getValue().equals(map2.get(e.getKey())))
                 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map3);

    }
}
