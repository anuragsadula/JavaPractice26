package practice;

import java.util.Scanner;

class Solution {

    public int findThirdLargestNumber(int[] nums) {

        int firstMax = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            if(nums[i]>=firstMax){

                firstMax = nums[i];
            }
        }

        if(nums.length<=2){

            return firstMax;
        }

        int secondMax = Integer.MIN_VALUE;
        boolean flag = false;

        for(int j=0;j<nums.length;j++){

            if(nums[j]>=secondMax && nums[j]<firstMax){

                flag = true;
                secondMax = nums[j];
            }
        }

        if(flag==false)
            return firstMax;

        int thirdMax = Integer.MIN_VALUE;
        flag = false;

        for(int k=0;k<nums.length;k++){

            if(nums[k]>=thirdMax && nums[k]<firstMax && nums[k]<secondMax){

                flag = true;
                thirdMax = nums[k];
            }
        }

        if(flag==false)
            return firstMax;

        return thirdMax;
    }
}
public class FindThirdLargestNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = input.nextInt();
        }

        Solution solution = new Solution();

        int thirdMax = solution.findThirdLargestNumber(arr);

        System.out.println(thirdMax);

        input.close();
    }
}
