package practice;

import java.util.HashMap;
public class HashMap_Example {

    public static void main(String[] args) {
        
        HashMap<Integer,Character> map = new HashMap<>();

        map.put(1, 'A');
        map.put(2,'B');
        map.put(1, 'C');

        System.out.println(map);
    }
}
