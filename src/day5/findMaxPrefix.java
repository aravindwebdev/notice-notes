package day5;

import java.util.ArrayList;
import java.util.List;

public class findMaxPrefix {

    //Bruteforce solution
    public List<Integer> maxPrefixesBruteForce(List<Integer> arr, List<Integer> leftIndex,
                                     List<Integer> rightIndex) {
        // code here.
        int q = rightIndex.size();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int left = leftIndex.get(i);
            int right = rightIndex.get(i);
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int j = left; j <= right; j++) {
                sum += arr.get(j);
                max = Math.max(max, sum);
            }
            res.add(max);
        }
        return res;
    }
}
