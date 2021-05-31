package com.it.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 两数之和，返回索引下标
 *
 * @author Lyle
 * @date 2021/5/22
 */
public class Sum {
    public static void main(String[] args) {
        // [3,2,3]
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
        List<Integer> list = new ArrayList<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        result = list.stream().mapToInt(Integer::valueOf).toArray();
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
        int[] ret = {0, (nums.length - 1)};
        while (ret[0] != ret[1]) {
            int part1 = nums[ret[0]];
            int part2 = nums[ret[1]];
            if (part1 + part2 == target) return ret;
            for (int i = (ret[0] + 1); i < ret[1]; i++) {
                if (nums[i] + part1 == target) {
                    ret[1] = i;
                    return ret;
                }
            }

            for (int j = (ret[1] - 1); j > ret[0]; j--) {
                if (nums[j] + part2 == target) {
                    ret[0] = j;
                    return ret;
                }
            }
            ret[0]++;
            ret[1]--;
        }
        return null;
    }
}
