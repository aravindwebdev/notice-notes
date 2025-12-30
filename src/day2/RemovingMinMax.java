package day2;

public class RemovingMinMax {
    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] > nums[max]){
                max = i;
            }
            if(nums[i] < nums[min]){
                min = i;
            }
        }

        int deleteFromFront = Math.max(max,min)+1;
        int deleteFromBack = n - Math.min(max, min);
        int deleteFromBothSide = (Math.min(max, min)+1) + (n-Math.max(max, min));

        return Math.min(deleteFromBothSide, Math.min(deleteFromFront, deleteFromBack));

    }
}
