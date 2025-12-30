package day2;

import java.util.ArrayList;
import java.util.List;

public class findMaxPrefix {
    public List<Integer> maxPrefixes(List<Integer> arr, List<Integer> leftIndex,
                                     List<Integer> rightIndex) {
        // code here.
        int q = leftIndex.size();

        List<Integer> res = new ArrayList<>();

        for(int i=0; i<q; i++){
            int l = leftIndex.get(i);
            int r = rightIndex.get(i);

            int sum = 0;
            int maxSum = Integer.MIN_VALUE;

            for(int j=l; j<=r; j++){
                sum += arr.get(j);
                maxSum = Math.max(maxSum, sum);
            }
            res.add(maxSum);
        }
        return res;
    }
}
