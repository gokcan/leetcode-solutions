package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 4, 0, 8, 0, 6, 0, 2};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));

    }

    private static void moveZeroes(int[] nums) {

        int length = nums.length;
        
        if (length == 0 || nums == null) 
            return;

        int j = 0;
        for (int i = 0; i < length; i++) {

            if (nums[i] != 0) {
                // Swap Hack by simple Bitwise XOR operation, cool huh ?
                nums[j] = nums[j] ^ nums[i] ^ (nums[i] = nums[j]);
                j++;
            }
        }

    }


}
