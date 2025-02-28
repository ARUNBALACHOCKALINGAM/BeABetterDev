package leetcode.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // check if there is an element in the hashmap such that
            // target - current = element -> element + current = target
            if (map.containsKey(target - nums[i])) {
                return new int[] { i, map.get(target - nums[i]) };
            }

            // store element in map
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,1,7},9)));

    }
}
