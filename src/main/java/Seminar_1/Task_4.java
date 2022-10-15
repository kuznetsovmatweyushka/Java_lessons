package Seminar_1;

//Given an integer array nums, move all 0's to the end of
// it while maintaining the relative order
// of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
public class Task_4 {

    public static void moveZeroes(int[] nums) {
        int copyIND = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[copyIND] = nums[i];
                copyIND++;
            }
        }
        while ((copyIND < nums.length)) {
            nums[copyIND++] = 0;
        }
    }
}
