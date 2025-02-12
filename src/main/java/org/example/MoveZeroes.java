package org.example;

import java.lang.reflect.Array;

/**
 * MoveZeroes solution.
 */
public class MoveZeroes {
    private MoveZeroes() {
    }

    /**
     * Runs solution.
     *
     * @param nums List of integers that should be processed.
     */
    public static void run(final int[] nums) {
        int number;
        int notZeroesCount = 0;

        for (int i = 0; i < nums.length; i++) {
            number = (int) nums[i];
            if (number != 0) {
                nums[notZeroesCount++] = number;
            }
        }

        for (int i = notZeroesCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * Runs test of solution.
     *
     * @param nums List of integers that should be tested.
     */
    public static void test(final int[] nums)
    {
        MoveZeroes.run(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(' ');
        }
        System.out.println(' ');
    }
}
