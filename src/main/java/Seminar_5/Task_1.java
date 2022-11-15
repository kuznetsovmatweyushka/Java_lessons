package Seminar_5;

import java.util.HashSet;
import java.util.Set;


public class Task_1 {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(sol(nums));
    }
    public static boolean sol(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int num : arr){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
