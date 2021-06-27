package edu.cnm.deepdive;

/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */

import java.util.Arrays;

public class CodingBatTheTenRun {

  public static void main(String[] args) {
    System.out.println("The array [2, 10, 3, 4, 20, 5] gives "
        + Arrays.toString(tenRun(new int[] {2, 10, 3, 4, 20, 5})) + ".");
    System.out.println("The array [10, 1, 20, 2] gives "
        + Arrays.toString(tenRun(new int[] {10, 1, 20, 2}))  + ".");
    System.out.println("The array [10, 1, 9, 20] gives "
        + Arrays.toString(tenRun(new int[] {10, 1, 9, 20}))  + ".");
  }

  public static int[] tenRun(int[] nums) {

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] % 10 == 0) {
        while (nums[i + 1] % 10 != 0) {
          nums[i + 1] = nums[i];
        }
      }
    }
    return nums;
  }

}
