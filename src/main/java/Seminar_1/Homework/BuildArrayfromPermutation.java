package Seminar_1.Homework;

import java.util.Arrays;

//Дан массив nums длиной n, создать массив ans длиной n, где ans[i] == nums[nums[i]] для 0 <= i < nums.size().
public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
