/**
 * Author: lisiyu
 * Created: 2019/12/10
 */

// leetcode 169 ----- 多数元素
    // 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    // 你可以假设数组是非空的，并且给定的数组总是存在多数元素。

public class MajorityElement169 {
    // 1. 直接遍历
    public int majorityElement(int[] nums) {
        int a = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > a) {
                return nums[i];
            }
        }
        return -1;
    }
    // 2. 位运算法
}