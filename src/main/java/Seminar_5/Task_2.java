package Seminar_5;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 2, 1};
        int[] ar2 = {2, 2};
        System.out.println(Arrays.toString(sol(ar1, ar2)));
    }

    public static int[] sol(int[] arr_1, int[] arr_2) {
        if (arr_1.length > arr_2.length) {
            return sol(arr_2, arr_1);
        }
        Set<Integer> set = new HashSet<>();
        for (int num : arr_1) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr_2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
