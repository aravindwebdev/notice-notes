package day1;

public class Search {
    public static int linearSearch(int arr[], int x) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[], int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int res = -1;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid]==x){
                res = mid;
                high = mid-1;
            }
            else if(arr[mid] < x){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int target = 3;
        System.out.println("Linear Search: " + linearSearch(arr,target));
        System.out.println("Binary Search: " + binarySearch(arr,target));

    }
}
