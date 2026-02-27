package practice;

import java.util.Scanner;

public class InsertionSortAlgorithm_03 {

    public static void main(String[] args){

        System.out.println("Enter the size of the array: ");
        // 1. Take input from the user to define the size of the array

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        // 2. Take input from the user to fill the array

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        // 3. Implementing Insertion Sort Algorithm

        for(int i=1;i<n;i++){

            int currElement = arr[i];

            int j = i - 1;

            while(j>=0 && arr[j] > currElement){

                arr[j + 1] = arr[j];

                j--;

            }

            arr[j + 1] = currElement;
        }

        System.out.println("The sorted array is: ");

        // 4. Print the sorted array

        for(int i=0;i<n;i++){

            System.out.print(arr[i] + " ");
        }
    }
}
