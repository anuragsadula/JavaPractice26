package practice;

import java.util.Scanner;

public class ReverseTheSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String[] strArr = str.split(" ");

        StringBuilder reversed = new StringBuilder();

        for(int i=strArr.length-1;i>=0;i--){

            reversed.append(strArr[i]);

            if(i!=0){
                reversed.append(" ");
            }
        }

        System.out.println(reversed);
    }
}