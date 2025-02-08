package org.example;

import java.lang.reflect.Array;

public class MoveZeroes {
    public static void run(int[] nums) {
        int number;
        int notZeroesCount = 0;

        for (int i=0; i<nums.length; i++) {
            number = (int)Array.get(nums,i);
            if(number != 0) {
                nums[notZeroesCount++] = number;
            }
        }

        for (int i=notZeroesCount; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}
