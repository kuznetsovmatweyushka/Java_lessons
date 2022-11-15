package Seminar_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(sol(nums, target)));
    }

    public static int[] sol(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int added = target - nums[i];
            if (map.containsKey(added)) {
                return new int[]{map.get(added), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
