package practice;
import java.util.Scanner;
public class InsertionSortAlgorithm {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter "+n+" elements with space seperated: ");

        for(int a=0;a<n;a++){

            arr[a] = input.nextInt();
        }

        System.out.print("Array before sorting: ");

        for(int b=0;b<n;b++){

            System.out.print(arr[b]+" ");
        }

        System.out.println();

        int j = 0;
        int currElement = 0;

        for(int i=1;i<n;i++){
            
            j = i-1;
            currElement = arr[i];

            while(j>=0 && currElement<arr[j]){

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = currElement;
        }

       System.out.print("Array after sorting: ");
        
        for(int k=0;k<n;k++){

            System.out.print(arr[k]+" ");
        }

        input.close();
    }
}
