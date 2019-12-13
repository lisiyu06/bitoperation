/**
 * Author: lisiyu
 * Created: 2019/12/13
 */

// LeetCode 190 ----- 颠倒二进制位
    // 颠倒给定的 32 位无符号整数的二进制位。

public class ReverseBits190 {
    public int reverseBits(int n) {
        int ret = 0;
        int count = 0;
        while (count < 32) {
            ret <<= 1;     // ret左移一位空出位置
            ret |= (n & 1);    //把得到的最低位加过来
            n >>= 1;
            count++;
        }
        return ret;
    }
}