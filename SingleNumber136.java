/**
 * Author: lisiyu
 * Created: 2019/12/9
 */

// leetcode 136 ----- 只出现一次的数字
    // 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    // 说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
    // 有四种方法：这里用位运算（异或）

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ret = ret ^ nums[i];
            }
        }
        return ret;
    }
}
