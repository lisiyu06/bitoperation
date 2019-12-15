/**
 * Author: lisiyu
 * Created: 2019/12/15
 */

// leetcode 191 ----- 位 1 的个数
// 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。

public class HammingWeight191 {
    public int hammingWeight(int n) {
        int sum = 0;
        int cur = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & cur) != 0) {
                sum++;
            }
            cur <<= 1;
        }
        return sum;
    }
}
