package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray_M {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = input.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < size; i++){

            arr.add(input.nextInt());
        }

        System.out.print("Enter the from index to be reversed: ");

        int m = input.nextInt();

        ArrayList<Integer> reversed = new ArrayList<>();

        reversed.addAll(0, arr.subList(0, m+1));

        for(int i = arr.size() - 1; i > m; i--){

            reversed.add(arr.get(i));
        }

        arr.clear();

        arr.addAll(reversed);
    }
}
