/**
 * Author: lisiyu
 * Created: 2019/12/26
 */

// LeetCode 405 ----- 数字转换为十六进制数
    // 给定一个整数，编写一个算法将这个数转换为十六进制数。对于负整数，我们通常使用 补码运算 方法。
    //一个int= 4字节 = 32位
    // 这个32位数字可以被分隔成8个4位数，所以我们只需要从头到尾每4位每4的的遍历，每遍历一个4位就将其转化为16进制的数即可.

public class ToHex405 {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        String ret = "";
        String cur = "0123456789abcdef";

        while ((num != 0) && (ret.length() < 8)) {
            ret = cur.charAt(num & 0xf) + ret;
            num >>= 4;
        }
        return ret;
    }
}
