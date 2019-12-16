/**
 * Author: lisiyu
 * Created: 2019/12/16
 */

// LeetCode 231 ----- 2 的幂
    // 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。

public class IsPowerOfTwo231 {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
}
