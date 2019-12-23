/**
 * Author: lisiyu
 * Created: 2019/12/21
 */

// LeetCode 371 ----- 两整数之和
    // 不使用运算符 + 和 -，计算两整数 a 、b 之和。

public class GetSum371 {
    public int getSum(int a, int b) {
        while(b != 0) {
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }
}
