/**
 * Author: lisiyu
 * Created: 2019/12/21
 */
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
