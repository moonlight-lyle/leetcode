package com.it.Array;

import java.util.*;

/**
 * 返回数组中重复的数字
 *
 * @author Lyle
 * @date 2021/5/22
 */
public class RepeatNumber {
    public static void main(String[] args) {
        int[] nums=new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber2(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        // [2, 3, 1, 0, 2, 5, 3]
//        List<Integer> list=new ArrayList<>();
//        for (int num : nums) {
//            if (list.contains(num)){
//                return num;
//            }else {
//                list.add(num);
//            }
//        }
//        return -1;
        Map map=new HashMap();
        for (int num : nums) {
           if (map.get(num)!=null){
              return num;
           } else {
               map.put(num,num);
           }
        }
        return -1;
    }

    public static int findRepeatNumber2(int[] nums) {
        // [2, 3, 1, 0, 2, 5, 3]
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            // 添加失败，证明该元素已存在
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
