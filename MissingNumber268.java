import java.util.Arrays;

/**
 * Author: lisiyu
 * Created: 2019/12/18
 */

// LeetCode 268 ----- 缺失数字
    // 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
    // 时间复杂度：O(n)。O(n) 次异或运算
    // 空间复杂度：O(1) 额外空间

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i <nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}