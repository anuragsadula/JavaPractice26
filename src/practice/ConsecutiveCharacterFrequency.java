package practice;

public class ConsecutiveCharacterFrequency {

    public static void main(String[] args){

        String str = "aabbbccdd";

        int count = 1;

        for(int i=0;i<str.length()-1;i++){

            if(str.charAt(i)==str.charAt(i+1)){

                count++;
            }
            else{

                System.out.print(""+str.charAt(i)+count);
                count = 1;
            }
        }
        
        System.out.print(""+str.charAt(str.length()-1)+count);
    }
}
