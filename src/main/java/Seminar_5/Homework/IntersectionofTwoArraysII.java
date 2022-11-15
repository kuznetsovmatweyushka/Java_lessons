package Seminar_5.Homework;

import java.util.*;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
//        int[] nums2 = {3, 1, 2};
//        int[] nums1 = {1, 1};
        int[] nums2 = {1, 2, 2, 1};
        int[] nums1 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            int currNum = nums2[i];
            map.putIfAbsent(currNum, 0);
            map.put(currNum, map.get(currNum) + 1);
        }
        List<Integer> lst = new ArrayList<>();
        for (int num : nums1) {
            if (map.containsKey(num) && map.get(num) > 0) {
                lst.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] ans = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            ans[i] = lst.get(i);
        }
        return ans;
    }
}
