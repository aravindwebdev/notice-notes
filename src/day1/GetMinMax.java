package day1;

import java.util.ArrayList;

public class GetMinMax {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        res.add(min);
        res.add(max);

        return res;
    }
}
