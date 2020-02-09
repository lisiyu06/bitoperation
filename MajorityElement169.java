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

    // 法 2：位运算
    // 将数组中的元素均写成 二进制形式，每一位分别与 mask = 1，mask <<= 1 相与
    // 统计出每一列上的位 出现 1 的个数
    // 将 1 过半的二进制数保存下来，组合在一起就是数组中过半的元素
    public int majorityElement3(int[] nums) {
        int cur = 0;
        for (int i = 0, mask = 1; i < 32; i++, mask <<= 1) {
            int bit = 0;
            // 计算当前列 1 的个数
            for (int j = 0; j < nums.length; j++) {
                if ((mask & nums[j]) == mask) {
                    bit++;
                }
            }
            // 判断当前列的 1的个数
            if (bit > (nums.length / 2)) {
                cur |= mask;
            }
        }
        return cur;
    }
}