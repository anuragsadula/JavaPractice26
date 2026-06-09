package practice;

public class SquareRootOfN_BinarySearch {

    public static void main(String[] args){

        int n = 28;

        int low = 1;
        int high = n;

        while(low<=high){

            int mid = low + (high-low)/2;

            long val = (long)mid * (long)mid;

            if(val<=(long)n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        System.out.println(high);
    }
}
