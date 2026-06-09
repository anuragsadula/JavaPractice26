package practice;

import java.util.HashMap;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        String a = input.next();
        String b = input.next();

        a = a.toLowerCase();
        b = b.toLowerCase();

        input.close();

        boolean result = isAnagrams(a,b);

        System.out.println((result)?"Anagrams":"Not Anagrams");

    }

    static boolean isAnagrams(String a, String b) {
        // TODO Auto-generated method stub

        HashMap<Character,Integer>hm = new HashMap<>();

        boolean result = true;

        for(int i=0;i<a.length();i++){

            if(hm.containsKey(a.charAt(i))){

                int value = hm.get(a.charAt(i));
                hm.put(a.charAt(i),value+1);
            }
            else{

                hm.put(a.charAt(i),1);
            }
        }

        for(int j=0;j<b.length();j++){

            if(hm.containsKey(b.charAt(j))){

                int value = hm.get(b.charAt(j));
                hm.put(b.charAt(j),value-1);
                result = true;
            }
            else{
                result = false;
                break;
            }
        }

        return result;
    }
}