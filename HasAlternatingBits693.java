/**
 * Author: lisiyu
 * Created: 2020/1/3
 */

// LeetCode 693 ----- 交替位二进制数
    // 给定一个正整数，检查他是否为交替位二进制数：
    // 换句话说，就是他的二进制数相邻的两个位数永不相等。

public class HasAlternatingBits693 {
    public boolean hasAlternatingBits2(int n) {
        int cur = n & 1;
        int temp;
        while (n != 0) {
            n = n >> 1;
            temp = n & 1;
            if (cur == temp) {
                return false;
            } else {
                cur = temp;
            }
        }
        return true;
    }
}
