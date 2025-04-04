package _001_TwoSum;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  Solution solution = new Solution();
  @Test
  public void Test0() {
    int[] nums = { 2, 7, 11, 13 };
    int target = 9;
    int[] actuals = solution.twoSum(nums, target);
    System.out.println(Arrays.toString(actuals));
    int[] expecteds = { 1, 2 };
    assertArrayEquals(expecteds, actuals);
  }

}
